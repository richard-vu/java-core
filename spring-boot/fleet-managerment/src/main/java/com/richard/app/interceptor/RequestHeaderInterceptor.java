/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.richard.app.exceptions.InvalidHeaderFieldException;

/**
 * @author richard
 *
 */
@Component
public class RequestHeaderInterceptor extends HandlerInterceptorAdapter {
 @Override
 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

  if(StringUtils.isBlank(request.getHeader("auth-key"))) {
   System.out.println("Header: " +request.getHeader("auth-key"));
   throw new InvalidHeaderFieldException("Invalid request");
  }
  return super.preHandle(request, response, handler);
 }
}
