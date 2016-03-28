package ssta.pe.p031_040;

import ssta.pelib.SsMath;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem32 {

  /**
   * We shall say that an n-digit number is pandigital if it makes use of all
   * the digits 1 to n exactly once; for example, the 5-digit number, 15234, is
   * 1 through 5 pandigital.
   * <p>
   * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
   * multiplicand, multiplier, and product is 1 through 9 pandigital.
   * <p>
   * Find the sum of all products whose multiplicand/multiplier/product
   * identity can be written as a 1 through 9 pandigital.
   * <p>
   * HINT: Some products can be obtained in more than one way so be sure to only
   * include it once in your sum.
   */
  public String solve() {
    Set<Integer> prods = new HashSet<>();
    // guessed at an upper limit until I got the right answer...
    // I could have been cleverer, but this is clever enough and fairly fast
    int MAX = 2000;
    for (int a = 1; a < MAX; a++) {
      for (int b = 1; b < MAX; b++) {
        int c = a * b;
        String s = "" + a + "" + b + "" + c;
        if (SsMath.isPandigitalLength(s, 9)) {
          prods.add(c);
        }
      }
    }
    return String.valueOf(prods.stream().reduce(0, Integer::sum));
  }
}
