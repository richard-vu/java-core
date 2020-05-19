/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.io.entities.Machine;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  Machine machine1 = new Machine();
  Machine machine2 = new Machine("Chalky", 7);

  System.out.println(machine1.getName());
  System.out.println(machine2.getName());
 }
}
