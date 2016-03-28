package ssta.pe.p031_040;

import ssta.pelib.SsString;

/**
 * Created by ssta on 17/05/15.
 */
public class Problem36 {
  public static void main(String[] args) {
    System.out.println(new Problem36().solve());
  }

  /**
   * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
   * <p>
   * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
   * <p>
   * (Please note that the palindromic number, in either base, may not include leading zeros.)
   */
  public String solve() {
    int sum = 0;
    int MAX = 1000000;
    for (int i = 0; i < MAX; i++) {
      String n10 = Integer.toString(i);
      String n2 = Integer.toBinaryString(i);
      if (SsString.isPalindrome(n10) && SsString.isPalindrome(n2)) {
        sum += i;
      }
    }
    return String.valueOf(sum);
  }


}
