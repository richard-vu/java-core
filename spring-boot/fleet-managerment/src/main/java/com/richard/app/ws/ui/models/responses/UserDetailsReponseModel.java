/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.models.responses;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class UserDetailsReponseModel implements Serializable{
 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 9005153524900454858L;

 private Long id;

 private String userId;

 private String firstName;

 private String lastName;

 private String email;
}
