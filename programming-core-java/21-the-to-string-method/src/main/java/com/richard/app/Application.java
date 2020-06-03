/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.entities.Frog;

/**
 * @author richard
 *
 */
public class Application {

 /**
  * @param args
  */
 public static void main(String[] args) {
  Frog frog1 = new Frog(7, "Freddy");
  Frog frog2 = new Frog(5, "Roger");

  System.out.println(frog1);
  System.out.println(frog2);
 }

}
