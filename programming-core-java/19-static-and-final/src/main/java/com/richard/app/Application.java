/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.io.entities.Thing;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  Thing.setDescription("I am a thing");

  Thing.showInfo();

  System.out.println("Before creating objects, count is: " + Thing.getCount());

  Thing thing1 = new Thing();
  Thing thing2 = new Thing();

  System.out.println("After creating objects, count is: " + Thing.getCount());

  thing1.setName("Richard");
  thing2.setName("Sue");

  thing1.showName();
  thing2.showName();

  System.out.println(Math.PI);

  System.out.println(Thing.getLuckyNumber());
 }
}
