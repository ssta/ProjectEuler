package ssta.pe.p031_040;

import ssta.pelib.PrimesFromFile;

import java.util.TreeSet;

/**
 * Created by ssta on 17/05/15.
 */
public class Problem37 {
  // a treeset is FAST for lookups
  TreeSet<Integer> primes = null;

  public static void main(String[] args) {
    Problem37 p = new Problem37();
    p.primes = new TreeSet<>();
    p.primes.addAll(PrimesFromFile.getIntegerPrimes());
    System.out.println(p.isLeftTrunc(3797));
    System.out.println(p.isRightTrunc(3797));
    System.out.println(p.solve());
  }

  /**
   * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
   * <p>
   * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
   * <p>
   * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
   */
  public String solve() {
    // pick an upper bound (semi)randomly -- as long as it works, it's fine
    int MAX = 1000000;
    int sum = 0;
    primes = new TreeSet<>();
    primes.addAll(PrimesFromFile.getIntegerPrimes());
    for (int p : primes) {
      if (p < 10) {continue;}
      if (p > MAX) {break;}
      if (isRightTrunc(p) && isLeftTrunc(p)) {
        sum += p;
      }
    }
    return String.valueOf(sum);
  }

  private boolean isLeftTrunc(int p) {
    while (p > 10) {
      int len = (int) Math.log10(p);
      for (int i = len; i > 0; i--) {
        p %= (int) Math.pow(10, i);
        if (!primes.contains(p)) {return false;}
      }
    }
    return true;
  }

  private boolean isRightTrunc(int p) {
    while (p > 10) {
      p /= 10;
      if (!primes.contains(p)) {return false;}
    }
    return true;
  }


}
