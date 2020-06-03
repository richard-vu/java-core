/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.property.Property;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/conf-property")
public class ConfigurationPropertyController {

 @Autowired
 private Property property;

 @GetMapping
 public List<String> fetConfigurationProperties() {
  List<String> propertyValues = new ArrayList<>();

  propertyValues.add(String.valueOf(property.getNoOfStudents()));
  propertyValues.add(property.getSchoolName());
  
  return propertyValues;
 }
}
