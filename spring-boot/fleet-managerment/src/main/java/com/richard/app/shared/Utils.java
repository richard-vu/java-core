/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Service;

/**
 * @author richard
 *
 */
@Service
public class Utils {
 private final Random RANDOM = new SecureRandom();
 private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

 public String generateUserId(int length) {
  return generateRandomString(length);
 }

 public String generateAddressId(int length) {
  return generateRandomString(length);
 }

 private String generateRandomString(int length) {
  StringBuilder returnValue = new StringBuilder(length);

  for (int i = 0; i < length; i++) {
   returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
  }

  return new String(returnValue);
 }
}
