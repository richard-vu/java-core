/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.io.entities.Frog;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  Frog frog1 = new Frog();

  //frog1.name = "Bertie";
  //frog1.age = 1;

  frog1.setName("Bertie");
  frog1.setAge(1);

  System.out.println(frog1.getName());

 }
}
