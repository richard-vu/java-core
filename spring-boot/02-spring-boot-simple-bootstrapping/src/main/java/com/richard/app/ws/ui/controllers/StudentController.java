/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.exceptions.InvalidFieldException;
import com.richard.app.securities.StudentService;
import com.richard.app.shared.dto.StudentDto;
import com.richard.app.ws.ui.models.requests.StudentRequest;
import com.richard.app.ws.ui.models.responses.StudentAddSuccess;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws/students")
public class StudentController {
 @Autowired
 private StudentService studentService;

 @PostMapping("/add")
 public StudentAddSuccess saveStudent(@RequestBody StudentRequest studentRequest) {

  if (studentRequest.getAge() <= 0) {
   throw new InvalidFieldException("Age lest than 0");
  }

  ModelMapper modelMapper = new ModelMapper();
  StudentDto  studentDto  = modelMapper.map(studentRequest, StudentDto.class);

  return studentService.addStudent(studentDto);
 }

}
