/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.shared.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class UserDto implements Serializable{

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = -3258395836660650603L;

 private long id;

 private String userId;

 private String firstName;

 private String lastName;

 private String email;

 private String password;
 
 private String emailVerificationToken;

 private Boolean emailVerificationStatus;
 
 private List<AddressDto> addresses;
 
}
