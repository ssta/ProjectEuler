package ssta.pe.p011_020;

import java.math.BigInteger;

/**
 * Created by ssta on 03/05/15.
 */
class Problem16 {

  private static int sumDigits(String s) {
    int sum = 0;
    for (char c : s.toCharArray()) {
      sum += c - '0';
    }
    return sum;
  }

  /**
   * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
   * <p>
   * What is the sum of the digits of the number 2^1000?
   */
  public String solve() {
    // trivial with BigInteger
    BigInteger b = BigInteger.valueOf(2).pow(1000);
    return String.valueOf(sumDigits(b.toString()));
  }
}
