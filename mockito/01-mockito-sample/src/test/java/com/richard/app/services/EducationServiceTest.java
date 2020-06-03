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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.richard.app.dao.EducationDao;
import com.richard.app.entities.Student;

/**
 * @author richard
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class EducationServiceTest {
 @InjectMocks
 private EducationService educationService;

 @Mock
 private EducationDao educationDao;

 @Test
 public void testAuthenticationSuccess() {
  Student student = new Student("Richard", "123123", "Java", false, "");
  when(educationDao.autheticate(student.getUserName(), student.getPassword())).thenReturn(true);
  assertTrue(educationService.authenticate(student));
 }
 
 @Test
 public void testAuthenticationFail() {
  Student student = new Student("Richard", "123123", "Java", false, "");
  when(educationDao.autheticate(student.getUserName(), student.getPassword())).thenReturn(false);
  assertFalse(educationService.authenticate(student));
 }
}
