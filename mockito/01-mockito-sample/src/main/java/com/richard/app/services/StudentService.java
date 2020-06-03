/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services;

import com.richard.app.dao.StudentDao;
import com.richard.app.entities.Student;

import lombok.AllArgsConstructor;

/**
 * @author richard
 *
 */
@AllArgsConstructor
public class StudentService {
 private StudentDao studentDao;
 
 public boolean saveStudent(Student student) {
  return studentDao.saveStudent(student);
 }
}
