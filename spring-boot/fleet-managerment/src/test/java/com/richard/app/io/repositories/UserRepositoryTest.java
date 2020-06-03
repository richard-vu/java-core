/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.repositories;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.richard.app.io.entities.UserEntity;

/**
 * @author richard
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {
 @Autowired
 UserRepository userRepository;

 static boolean recordsCreated = false;

 @BeforeEach
 void setUp() throws Exception {

  if (!recordsCreated)
   createRecrods();
 }

 @Test
 final void testFindUserByFirstName() {
  String           firstName = "Sergey";
  List<UserEntity> users     = userRepository.findUserByFirstName(firstName);
  assertNotNull(users);
  assertTrue(users.size() == 2);

  UserEntity user = users.get(0);
  assertFalse(user.getFirstName().equals(firstName));
 }

 private void createRecrods() {
  // Prepare User Entity
  UserEntity userEntity = new UserEntity();
  userEntity.setFirstName("Sergey");
  userEntity.setLastName("Kargopolov");
  userEntity.setEmail("test@test.com");

  userRepository.save(userEntity);

  // Prepare User Entity
  UserEntity userEntity2 = new UserEntity();
  userEntity2.setFirstName("Sergey");
  userEntity2.setLastName("Kargopolov");
  userEntity2.setEmail("test@test.com");
  userRepository.save(userEntity2);

  recordsCreated = true;

 }
}
