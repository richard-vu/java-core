/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.exceptions;

/**
 * @author richard
 *
 */
public class InvalidHeaderFieldException extends RuntimeException {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 2066063465726412313L;

 public InvalidHeaderFieldException(String message) {
  super(message);
 }
}
