package ssta.pe.p001_010;

import ssta.pelib.SsMath;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem6 {
  /**
   * The sum of the squares of the first ten natural numbers is,
   * <p>
   * 1^2 + 2^2 + ... + 10^2 = 385
   * The square of the sum of the first ten natural numbers is,
   * <p>
   * (1 + 2 + ... + 10)^2 = 552 = 3025
   * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
   * <p>
   * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
   */
  public String solve() {
    long r = SsMath.sqSum(100) - SsMath.sqPyramidal(100);
    String result = String.valueOf(r);
    return result;
  }
}
