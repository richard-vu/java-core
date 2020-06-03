/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.richard.app.io.entities.StudentEntity;

/**
 * @author richard
 *
 */
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
 StudentEntity findByEmail(String email);
}
