/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class Person {
 //Instance variables (data or "state")
 private String name;
 private int age;

 // Classes can contain

 // 1. Data
 // 2. Subroutines (methods)

 public void speak() {
  for (int i = 0; i < 3; i++) {
   System.out.println("My name is: " + name + " and I am " + age + " years old ");
  }
 }

 public void sayHello() {
  System.out.println("Hello there!");
 }
}
