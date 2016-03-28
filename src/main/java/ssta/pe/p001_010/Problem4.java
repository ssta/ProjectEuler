package ssta.pe.p001_010;

import ssta.pelib.SsString;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem4 {
  /**
   * A palindromic number reads the same both ways. The largest palindrome made
   * from the product of two 2-digit numbers is 9009 = 91 × 99.
   * <p>
   * Find the largest palindrome made from the product of two 3-digit numbers.
   *
   * @return the solution
   */
  public String solve() {
    // no need for subtlety for such small numbers...
    int max = 0;
    for (int a = 100; a < 1000; a++) {
      for (int b = 100; b < 1000; b++) {
        int t = a * b;
        if (SsString.isPalindrome(String.valueOf(t))) {
          if (t > max) {
            max = t;
          }
        }
      }
    }
    String result = String.valueOf(max);
    return result;
  }
}
