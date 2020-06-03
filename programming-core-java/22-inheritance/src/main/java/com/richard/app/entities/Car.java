/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.entities;

/**
 * @author richard
 *
 */
public class Car extends Machine {
 @Override
 public void start() {
  System.out.println("Car started");
 }

 public void wipeWindShield() {
  System.out.println("Wiping windshield");
 }

 public void showInfo() {
  System.out.println("Car name: " + name);
 }
}
