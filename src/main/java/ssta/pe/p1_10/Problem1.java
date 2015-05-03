package ssta.pe.p1_10;

import static ssta.pelib.Math.triangle;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem1 {
  static final long MAX = 999L;

  /**
   * If we list all the natural numbers below 10 that are multiples of 3 or 5,
   * we get 3, 5, 6 and 9. The sum of these multiples is 23.
   * <p>
   * Find the sum of all the multiples of 3 or 5 below 1000.
   *
   * @return The answer to P1
   */
  public String solve() {

    long sum = 3 * (triangle(MAX / 3)) + 5 * (triangle(MAX / 5)) - 15 *
        (triangle(MAX / 15));

    return String.valueOf(sum);
  }
}
