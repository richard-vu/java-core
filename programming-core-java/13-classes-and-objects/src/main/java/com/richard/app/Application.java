/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.io.entities.Person;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
//Create a Person object using the Person class
  Person person1 = new Person();  
  person1.setName("Richard");
  person1.setAge(20);
   
  // Create a second Person object
  Person person2 = new Person();
  person2.setName("Hana");
  person2.setAge(20);
   
  System.out.println(person1.getName());
  System.out.println(person1.getAge());
  
  System.out.println(person2.getName());
  System.out.println(person2.getAge());
  
 }
}
