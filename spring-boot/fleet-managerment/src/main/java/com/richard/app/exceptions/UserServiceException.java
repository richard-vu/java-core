/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * @author richard
 *
 */
@Getter
public class UserServiceException extends RuntimeException {
 private static final long serialVersionUID = 1348771109171435607L;
 
 private HttpStatus httpStatus;

 public UserServiceException(HttpStatus httpStatus, String message) {
  super(message);
 }
 
}
