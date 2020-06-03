/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.controllers;

import java.lang.reflect.Type;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.services.UserService;
import com.richard.app.shared.dto.UserDto;
import com.richard.app.ws.ui.models.requests.UserDetailsRequestCreateModel;
import com.richard.app.ws.ui.models.requests.UserDetailsRequestEditModel;
import com.richard.app.ws.ui.models.responses.Notification;
import com.richard.app.ws.ui.models.responses.UserDetailsReponseModel;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws/users")
public class UserController {

 @Autowired
 private UserService userService;

 @PostMapping("/create")
 public ResponseEntity<Notification> createStudent(
   @Valid @RequestBody UserDetailsRequestCreateModel userDetailsRequestModel) {

  ModelMapper modelMapper = new ModelMapper();
  UserDto     userDto     = modelMapper.map(userDetailsRequestModel, UserDto.class);

  return new ResponseEntity<Notification>(userService.createUser(userDto), HttpStatus.OK);
 }

 @PostMapping("/creates")
 public ResponseEntity<Notification> createAllUser(
   @Valid @RequestBody List<UserDetailsRequestCreateModel> userDetailsRequestModel) {

  Type listType = new TypeToken<List<UserDto>>() {
  }.getType();

  List<UserDto> listUserDto = new ModelMapper().map(userDetailsRequestModel, listType);

  return new ResponseEntity<Notification>(userService.createAllUser(listUserDto), HttpStatus.OK);
 }

 @GetMapping
 public List<UserDetailsReponseModel> getAllUser() {
  return userService.getAllUsers();
 }

 @GetMapping("/{id}")
 public UserDetailsReponseModel getUserById(@PathVariable Long id) {
  return userService.getUserById(id);
 }

 @PutMapping("/{id}")
 public Notification updateByUserId(@PathVariable String id,
   @RequestBody UserDetailsRequestEditModel userDetailsRequestEditModel) {
  return userService.updateUserByUserId(id, userDetailsRequestEditModel);
 }

 @DeleteMapping("/{id}")
 public Notification deleleByUserId(@PathVariable String id) {
  return userService.deleleByUserId(id);
 }
 
 @DeleteMapping()
 public Notification deleleAllUser() {
  return userService.deleleAllUser();
 }

}
