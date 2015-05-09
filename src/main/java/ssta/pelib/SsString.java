package ssta.pelib;

/**
 * Created by ssta on 03/05/15.
 */
public class SsString {
  public static boolean isPalindrome(String s) {
    if (s == null) {return false;}
    if (s.length() < 2) {return true;}

    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {return false;}
    }
    return true;
  }

  /**
   * Return the product of the digits in s.  Assumes s is all digits.
   */
  public static long productOfDigits(String s) {
    long prod = 1;
    for (char c : s.toCharArray()) {
      prod *= c - '0';
    }
    return prod;
  }

  /**
   * Return the sum of digits in s.  Assumes s ia all digits
   */
  public static long sumDigits(String s) {
    long sum = 0;
    for (char c : s.toCharArray()) {
      sum += c - '0';
    }
    return sum;
  }

}
