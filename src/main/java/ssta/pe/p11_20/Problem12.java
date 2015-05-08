package ssta.pe.p11_20;

import ssta.pelib.SsMath;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem12 {

  /**
   * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
   * <p>
   * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
   * <p>
   * Let us list the factors of the first seven triangle numbers:
   * <p>
   * 1: 1
   * 3: 1,3
   * 6: 1,2,3,6
   * 10: 1,2,5,10
   * 15: 1,3,5,15
   * 21: 1,3,7,21
   * 28: 1,2,4,7,14,28
   * We can see that 28 is the first triangle number to have over five divisors.
   * <p>
   * What is the value of the first triangle number to have over five hundred divisors?
   */
  public String solve() {
    int i = 0;
    int count = 0;
    for (i = 1; ; i++) {
      count = (int) SsMath.countDivisors((int) SsMath.triangle(i));
      if (count > 500) break;
    }
    return String.valueOf(SsMath.triangle(i));
  }
}
