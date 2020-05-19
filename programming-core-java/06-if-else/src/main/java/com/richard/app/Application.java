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
  //Some useful conditions:
  System.out.println(10 != 11);
  System.out.println(3 < 6);
  System.out.println(10 > 100);

  // Using loops with "break": 
  int loop = 0;

  while (true) {
   System.out.println("Looping: " + loop);

   if (loop == 3) {
    break;
   }

   loop++;

   System.out.println("Running");
  }
 }
}
