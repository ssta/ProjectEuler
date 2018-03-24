package ssta.pe.P021_030;

import ssta.pelib.PrimesFromFile;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by ssta on 03/05/15.
 */
class Problem27 {

  /**
   * Euler discovered the remarkable quadratic formula:
   * <p>
   * n² + n + 41
   * <p>
   * It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. However, when n = 40, 402 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.
   * <p>
   * The incredible formula  n² − 79n + 1601 was discovered, which produces 80 primes for the consecutive values n = 0 to 79. The product of the coefficients, −79 and 1601, is −126479.
   * <p>
   * Considering quadratics of the form:
   * <p>
   * n² + an + b, where |a| < 1000 and |b| < 1000
   * <p>
   * where |n| is the modulus/absolute value of n
   * e.g. |11| = 11 and |−4| = 4
   * Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.
   */
  public String solve() {
    List<Integer> primes = PrimesFromFile.getIntegerPrimes();
    TreeSet<Integer> pset = new TreeSet<>(primes);
    int maxa = 0;
    int maxb = 0;
    int maxprimes = 0;

    for (int a = -999; a <= 999; a++) {
      for (int b = -999; b <= 999; b++) {
        int t = countPrimes(a, b, pset);
        if (t > maxprimes) {
          maxa = a;
          maxb = b;
          maxprimes = t;
        }
      }
    }

    return String.valueOf(maxa * maxb);
  }

  private int countPrimes(int a, int b, TreeSet<Integer> primes) {
    int count = 0;
    int n = 0;
    while (true) {
      int y = n * n + a * n + b;
      if (!primes.contains(y)) {
        return count;
      }
      count++;
      n++;
    }
  }
}
