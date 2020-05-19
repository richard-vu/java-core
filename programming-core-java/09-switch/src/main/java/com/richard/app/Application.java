/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app;

import java.util.Scanner;

/**
 * @author richard
 *
 */
public class Application {
 public static void main(String[] args) {
  try (Scanner scanner = new Scanner(System.in)) {
   int value = 0;
   do {
    System.out.println("Enter a number: ");
    value = scanner.nextInt();
   } while (value != 5);
   System.out.println("Got 5!");
  } catch (Exception e) {
   System.out.println("Error formatting");
  }

 }
}
