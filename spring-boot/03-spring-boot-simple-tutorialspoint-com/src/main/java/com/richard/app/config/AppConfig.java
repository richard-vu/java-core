/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.richard.app.interceptor.RequestHeaderInterceptor;

/**
 * @author richard
 *
 */
@Configuration
@RequestMapping("/ws")
public class AppConfig implements WebMvcConfigurer {
 @Autowired
 private RequestHeaderInterceptor requestHeaderInterceptor;
 
 @Bean
 public RestTemplate restTemplate() {
  return new RestTemplate();
 }

 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(requestHeaderInterceptor);
 }
}
