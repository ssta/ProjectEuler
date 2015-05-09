package ssta.pe.p11_20;

import ssta.pelib.SsMath;
import ssta.pelib.SsString;

import java.math.BigInteger;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem20 {
  /**
   * n! means n × (n − 1) × ... × 3 × 2 × 1
   * <p>
   * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
   * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
   * <p>
   * Find the sum of the digits in the number 100!
   */
  public String solve() {
    long sum;

    BigInteger b = SsMath.bigFactorial(100);
    sum = SsString.sumDigits(b.toString());

    return String.valueOf(sum);
  }
}
