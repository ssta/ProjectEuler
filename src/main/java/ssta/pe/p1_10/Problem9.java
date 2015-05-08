package ssta.pe.p1_10;

import ssta.pelib.SsMath;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem9 {
  /**
   * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
   * <p>
   * a^2 + b^2 = c^2
   * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
   * <p>
   * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
   * Find the product abc.
   */
  public String solve() {
    // inelegant brute force, but the problem size is tiny.
    // the PE forum has a beautiful algebraic O(1) solution.
    for (int a = 0; a < 500; a++) {
      for (int b = 0; b < 500; b++) {
        if (SsMath.isPerfectSquare(a * a + b * b)) {
          long c = (long) Math.sqrt(a * a + b * b);
          if (a + b + c == 1000) {
            return String.valueOf(a * b * c);
          }
        }
      }
    }
    return null;
  }
}
