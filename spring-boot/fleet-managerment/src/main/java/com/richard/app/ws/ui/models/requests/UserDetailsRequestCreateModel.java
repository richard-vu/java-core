/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.models.requests;

import java.util.List;

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
public class UserDetailsRequestCreateModel {
 @NotNull(message = "First name cannot be null")
 @Size(min = 2, message = "First name must not be less than 2 characters")
 private String firstName;

 @NotNull(message = "Last name cannot be null")
 @Size(min = 2, message = "Last name must not be less than 2 characters")
 private String lastName;

 @Email
 @Size(min = 4, message = "Email must not be less than 4 characters")
 private String email;

 @NotNull(message = "Password cannot be null")
 @Size(min = 8, max = 16, message = "Password must be equal or grater than 8 characters and less than 16 chaeracters")
 private String password;
 
 @NotNull(message = "Addresses cannot be null")
 private List<AddressRequestCreateModel> addresses;
 
}
