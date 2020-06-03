/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.securities;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author richard
 *
 */
public class MD5 {
 public static String getMd5(String input) {
  try {

   // Static getInstance method is called with hashing MD5 
   MessageDigest md = MessageDigest.getInstance("MD5");

   // digest() method is called to calculate message digest 
   //  of an input digest() return array of byte 
   byte[] messageDigest = md.digest(input.getBytes());

   // Convert byte array into signum representation 
   BigInteger no = new BigInteger(1, messageDigest);

   // Convert message digest into hex value 
   String hashtext = no.toString(16);
   while (hashtext.length() < 32) {
    hashtext = "0" + hashtext;
   }
   return hashtext;
  }

  // For specifying wrong message digest algorithms 
  catch (NoSuchAlgorithmException e) {
   throw new RuntimeException(e);
  }
 }
}
