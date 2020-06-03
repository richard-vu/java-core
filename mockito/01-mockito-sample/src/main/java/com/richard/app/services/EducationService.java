/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services;

import com.richard.app.dao.EducationDao;
import com.richard.app.entities.Student;

import lombok.AllArgsConstructor;

/**
 * @author richard
 *
 */
@AllArgsConstructor
public class EducationService {
 private EducationDao educationDao;

 public boolean authenticate(Student student) {
  return educationDao.autheticate(student.getUserName(), student.getPassword());
 }

 public boolean enroll(Student student) {
  educationDao.update(student);
  return student.isEnrolled();
 }

 public void retrieveTranscript(Student student) {
  if (educationDao.isEnrolled(student)) {
   student.setTranScript(educationDao.getTranscript(student));
  }
 }

}
