/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import com.richard.app.entities.Car;
import com.richard.app.entities.Machine;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  Machine mach1 = new Machine();

  mach1.start();
  mach1.stop();

  Car car1 = new Car();

  car1.start();
  car1.wipeWindShield();
  car1.showInfo();
  car1.stop();
 }
}
