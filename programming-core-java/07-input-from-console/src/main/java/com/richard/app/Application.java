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
  try (Scanner input = new Scanner(System.in)) { // Create scanner object
   // Output the prompt
   System.out.println("Enter a floating point value: ");

   // Wait for the user to enter something.
   double value = input.nextDouble();

   // Tell them what they entered.
   System.out.println("You entered: " + value);
  } catch (Exception e) {
   System.out.println("Error formatting");
  }
 }
}
