/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.models.requests;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class StudentRequest implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 @NotNull(message = "First name cannot be null")
 @Size(min = 2, message = "First name must not be less than 2 characters")
 private String firstName;

 @NotNull(message = "Last name cannot be null")
 @Size(min = 2, message = "Last name must not be less than 2 characters")
 private String lastName;

 @NotNull(message="Email cannot be null")
 @Email
 private String email;

 @NotNull(message="Age cannot be null")
 private int age;

}
