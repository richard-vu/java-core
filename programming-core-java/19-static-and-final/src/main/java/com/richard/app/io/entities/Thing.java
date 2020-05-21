/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class Thing {
 private final static int LUCKY_NUMBER = 7;

 private String name;
 private static String description;

 private static int count = 0;

 private int id;

 public Thing() {
  id = count;
  count++;
 }

 public void showName() {
  System.out.println("Object id: " + id + ", " + description + ": " + name);

 }

 public static void showInfo() {
  System.out.println(description);
  // Won't work: System.out.println(name);
 }

 /**
  * @return the luckyNumber
  */
 public static int getLuckyNumber() {
  return LUCKY_NUMBER;
 }

 /**
  * @return the description
  */
 public static String getDescription() {
  return description;
 }

 /**
  * @param description the description to set
  */
 public static void setDescription(String description) {
  Thing.description = description;
 }

 /**
  * @return the count
  */
 public static int getCount() {
  return count;
 }

 /**
  * @param count the count to set
  */
 public static void setCount(int count) {
  Thing.count = count;
 }

}
