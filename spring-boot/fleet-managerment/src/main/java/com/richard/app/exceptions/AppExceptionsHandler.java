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
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.richard.app.ws.ui.models.responses.ArgumentNotValidMassage;
import com.richard.app.ws.ui.models.responses.ErrorMessage;

/**
 * @author richard
 *
 */
@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

 @ExceptionHandler(value = { UserServiceException.class })
 public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request) {
  if (ex.getHttpStatus() == HttpStatus.CONFLICT) {
   ErrorMessage errorMessage = new ErrorMessage(HttpStatus.CONFLICT, new Date(), ex.getMessage());
   return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.CONFLICT);
  } else {
   ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_REQUEST, new Date(), ex.getMessage());
   return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

 }

 @ExceptionHandler(value = { Exception.class })
 public ResponseEntity<Object> handleOtherExceptions(Exception ex, WebRequest request) {
  ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, new Date(), ex.getMessage());

  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
 }

 @Override
 protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
   HttpStatus status, WebRequest request) {
  List<String>            errorList    = ex.getBindingResult().getFieldErrors().stream()
    .map(fieldError -> fieldError.getDefaultMessage()).collect(Collectors.toList());
  ArgumentNotValidMassage errorMessage = new ArgumentNotValidMassage(HttpStatus.BAD_REQUEST, new Date(), errorList);

  return handleExceptionInternal(ex, errorMessage, headers, errorMessage.getStatus(), request);
 }
}
