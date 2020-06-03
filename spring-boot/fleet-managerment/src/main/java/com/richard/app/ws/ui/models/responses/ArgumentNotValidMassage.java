/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.models.responses;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Data;

/**
 * @author richard
 *
 */
@Data
public class ArgumentNotValidMassage {
 private HttpStatus status;

 private Date timestamp;

 private List<String> errors;

 public ArgumentNotValidMassage(HttpStatus status, Date timestamp, List<String> errors) {
  super();
  this.status    = status;
  this.timestamp = timestamp;
  this.errors    = errors;
 }

 public ArgumentNotValidMassage(HttpStatus status, Date timestamp, String error) {
  super();
  this.status    = status;
  this.timestamp = timestamp;
  this.errors    = Arrays.asList(error);
 }
}
