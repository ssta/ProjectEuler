package ssta.pe.p31_40;

import ssta.pelib.SsMath;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem32 {

  public static void main(String[] args) {
    System.out.println(new Problem32().solve());
  }

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
    Set<Long> prods = new HashSet<>();
    for (long a = 1; a < 9876543321L; a++) {
      for (int b = 1; b < Math.ceil((double) 987654321 / a); b++) {
        long c = a * b;
        if (c > 987654321 || c < 100000000) {
          continue;
        }
        if (c > 100000000 && SsMath.isPandigital(c)) {
          prods.add(c);
          System.out.println("Added " + c);
        }
      }
    }
    return String.valueOf(prods.size());
  }
}
