/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import com.richard.app.dao.StudentDao;
import com.richard.app.entities.Student;

/**
 * @author richard
 *
 */
public class StudentServiceTest {

 @Test
 public void testSaveStudentSuccess() {
  StudentDao     studentDao     = Mockito.mock(StudentDao.class);
  StudentService studentService = new StudentService(studentDao);
  Student        student        = new Student("Richard", "123123", "Java", false, "");
  when(studentDao.saveStudent(student)).thenReturn(true);
  assertTrue(studentService.saveStudent(student));
 }

 @Test
 public void testSaveStudentFail() {
  StudentDao     studentDao     = Mockito.mock(StudentDao.class);
  StudentService studentService = new StudentService(studentDao);
  Student        student        = new Student("Richard", "123123", "Java", false, "");
  when(studentDao.saveStudent(student)).thenReturn(false);
  assertFalse(studentService.saveStudent(student));
 }
}
