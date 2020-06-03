/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services.impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.app.exceptions.StudentServiceException;
import com.richard.app.io.entities.StudentEntity;
import com.richard.app.io.repositories.StudentRepository;
import com.richard.app.securities.StudentService;
import com.richard.app.shared.dto.StudentDto;
import com.richard.app.ws.ui.models.responses.StudentAddSuccess;

/**
 * @author richard
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

 @Autowired
 private StudentRepository studentRepository;
 
 @Override
 public StudentAddSuccess addStudent(StudentDto studentDto) {
  if (studentRepository.findByEmail(studentDto.getEmail()) != null) {
   throw new StudentServiceException("Record already exists");
  }
  
  ModelMapper modelMapper = new ModelMapper();
  StudentEntity student = modelMapper.map(studentDto, StudentEntity.class);
  studentRepository.save(student);
  
  return new StudentAddSuccess(new Date(),"Student added sucessfully!");
 }

}
