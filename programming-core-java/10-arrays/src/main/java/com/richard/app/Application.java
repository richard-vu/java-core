/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  int[] values;
  values = new int[3];

  System.out.println(values[0]);

  values[0] = 10;
  values[1] = 20;
  values[2] = 30;

  System.out.println(values[0]);
  System.out.println(values[1]);
  System.out.println(values[2]);

  for (int i = 0; i < values.length; i++) {
   System.out.println(values[i]);
  }

  int[] numbers = { 5, 6, 7 };

  for (int i = 0; i < numbers.length; i++) {
   System.out.println(numbers[i]);
  }

 }
}
