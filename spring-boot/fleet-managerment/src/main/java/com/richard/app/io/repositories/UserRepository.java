/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.richard.app.io.entities.UserEntity;

/**
 * @author richard
 *
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
 UserEntity findByEmail(String email);
 
 UserEntity  findUserByUserId(String userId);

 @Query(value = "select * from Users u where u.first_name = ?1", nativeQuery = true)
 List<UserEntity> findUserByFirstName(String firstName);

}
