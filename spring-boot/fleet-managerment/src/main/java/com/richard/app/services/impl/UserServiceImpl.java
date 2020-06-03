/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.richard.app.exceptions.UserServiceException;
import com.richard.app.io.entities.AddressEntity;
import com.richard.app.io.entities.UserEntity;
import com.richard.app.io.repositories.UserRepository;
import com.richard.app.securities.MD5;
import com.richard.app.services.UserService;
import com.richard.app.shared.Utils;
import com.richard.app.shared.dto.UserDto;
import com.richard.app.ws.ui.models.requests.UserDetailsRequestEditModel;
import com.richard.app.ws.ui.models.responses.Notification;
import com.richard.app.ws.ui.models.responses.UserDetailsReponseModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @author richard
 * @param <S>
 *
 */
@Service
@Slf4j
public class UserServiceImpl<S> implements UserService {
 @Autowired
 private UserRepository userRepository;

 @Autowired
 Utils utils;

 /**
  * Create User
  */
 @Override
 public Notification createUser(UserDto userDto) {

  if (userRepository.findByEmail(userDto.getEmail()) != null) {
   throw new UserServiceException(HttpStatus.CONFLICT, "Record already exists");
  }

  UserEntity userEntity = new UserEntity();

  ModelMapper modelMapper = new ModelMapper();
  userEntity = modelMapper.map(userDto, UserEntity.class);

  String publicUserId = utils.generateUserId(30);
  userEntity.setUserId(publicUserId);
  userEntity.setEncryptedPassword(MD5.getMd5(userDto.getPassword()));
  userEntity.setEmailVerificationStatus(false);

  for (AddressEntity addressEntity : userEntity.getAddresses()) {
   addressEntity.setUserDetails(userEntity);
  }

  userRepository.save(userEntity);

  return new Notification(HttpStatus.CREATED, "User was created");
 }

 @Override
 public Notification createAllUser(List<UserDto> listUserDto) {

  Type listType = new TypeToken<List<UserEntity>>() {
  }.getType();

  List<UserEntity> listUserEntity = new ModelMapper().map(listUserDto, listType);

  for (UserEntity userEntity : listUserEntity) {
   String publicUserId = utils.generateUserId(30);
   userEntity.setUserId(publicUserId);
   userEntity.setEncryptedPassword(MD5.getMd5("123123123"));

   userEntity.setEmailVerificationStatus(false);

   for (AddressEntity addressEntity : userEntity.getAddresses()) {
    addressEntity.setUserDetails(userEntity);
   }
  }

  userRepository.saveAll(listUserEntity);
  return new Notification(HttpStatus.CREATED, "List User was created");
 }

 /**
  * Get All Users
  */
 @Override
 public List<UserDetailsReponseModel> getAllUsers() {
  List<UserEntity> listUserEntity = new ArrayList<>();

  userRepository.findAll().forEach(listUserEntity::add);

  if (listUserEntity.isEmpty()) {
   log.error("Database is null");
   throw new UserServiceException(HttpStatus.BAD_REQUEST, "Database is null");
  }

  //  Create Conversion Type
  Type listType = new TypeToken<List<UserDetailsReponseModel>>() {
  }.getType();

  //  Convert List of Entity objects to a List of DTOs objects 
  List<UserDetailsReponseModel> listUserResponse = new ModelMapper().map(listUserEntity, listType);

  log.info("debug enabled: {}", log.isDebugEnabled());

  return listUserResponse;

 }

 @Override
 public UserDetailsReponseModel getUserById(Long id) {
  ModelMapper          modelMapper = new ModelMapper();
  Optional<UserEntity> userEntity  = userRepository.findById(id);

  UserDetailsReponseModel userDetailsReponseModel = modelMapper.map(userEntity.get(), UserDetailsReponseModel.class);
  return userDetailsReponseModel;
 }

 @Override
 public Notification updateUserByUserId(String id, UserDetailsRequestEditModel userDetailsRequestEditModel) {

  UserEntity userEntity = userRepository.findUserByUserId(id);

  if (userEntity == null) {
   throw new UserServiceException(HttpStatus.BAD_REQUEST, "User does not exits");
  }

  userEntity.setFirstName(userDetailsRequestEditModel.getFirstName());
  userEntity.setLastName(userDetailsRequestEditModel.getLastName());

  userRepository.save(userEntity);

  return new Notification(HttpStatus.OK, "User was update");
 }

 @Override
 public Notification deleleByUserId(String id) {

  UserEntity userEntity = userRepository.findUserByUserId(id);

  if (userEntity == null) {
   throw new UserServiceException(HttpStatus.BAD_REQUEST, "User does not exits");
  }

  userRepository.delete(userEntity);

  return new Notification(HttpStatus.OK, "User was delete");
 }

 @Override
 public Notification deleleAllUser() {

  userRepository.deleteAll();

  return new Notification(HttpStatus.OK, "Users was delete");
 }

}