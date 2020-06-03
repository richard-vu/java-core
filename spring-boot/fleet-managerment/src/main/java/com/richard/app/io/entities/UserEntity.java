/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author richard
 *
 */
@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = -4135631862089776843L;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false, length = 250)
 private String userId;

 @Column(nullable = false, length = 50)
 private String firstName;

 @Column(nullable = false, length = 50)
 private String lastName;

 @Column(nullable = false, length = 120, unique = true)
 private String email;

 @Column(nullable = false)
 private String encryptedPassword;

 private String emailVerificationToken;

 @Column(nullable = false)
 private Boolean emailVerificationStatus = false;

 @OneToMany(mappedBy="userDetails", cascade=CascadeType.ALL)
 private List<AddressEntity> addresses;

}
