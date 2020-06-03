/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.richard.app.ws.ui.models.responses.ErrorMessage;

/**
 * @author richard
 *
 */
@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

 @ExceptionHandler(value = { StudentServiceException.class })
 public ResponseEntity<Object> handleUserServiceException(StudentServiceException ex, WebRequest request) {
  ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage());

  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
 }

 @ExceptionHandler(value = { Exception.class })
 public ResponseEntity<Object> handleOtherExceptions(Exception ex, WebRequest request) {
  ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage());

  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
 }
}