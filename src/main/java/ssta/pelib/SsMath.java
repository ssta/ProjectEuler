package ssta.pelib;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by ssta on 03/05/15.
 */
public class SsMath {
  // array of strings for use in comparing for pandigital testing
  private static String[] panComps = new String[]{"", "1", "12", "123",
      "1234", "12345", "123456", "1234567", "12345678", "123456789",
      "0123456789"};

  /**
   * return the ith triangle number
   */
  public static long triangle(long i) {
    return (i * (i + 1)) / 2;
  }

  /**
   * Return the ith square pyramidal number (sum_{1..i} i^2)
   */
  public static long sqPyramidal(long i) {
    return (i * (i + 1) * (2 * i + 1)) / 6;
  }

  /**
   * Return the square of the ith triangle number
   */
  public static long sqSum(long i) {
    return triangle(i) * triangle(i);
  }

  /**
   * Return true iff the argument is a perfect square
   */
  public static boolean isPerfectSquare(long l) {
    // the switch is a hack to instantly reject over 80% of possibilities
    // since the last 6 bots aof any perfect square must be one of the
    // cases.  There are only 12 of them out of 64 possible values.
    switch ((int) (l & 0x3F)) {
      case 0x00:
      case 0x01:
      case 0x04:
      case 0x09:
      case 0x10:
      case 0x11:
      case 0x19:
      case 0x21:
      case 0x24:
      case 0x29:
      case 0x31:
      case 0x39:
        long sqrt;
        if (l < 410881L) {
          // John Carmack's (very fast and mysterious 'magic number' hack)
          // it can fail for numbers larger than 410881L (because of float
          // precision) it probably works if you use doubles, but doubles are
          // (slightly) slower
          int i;
          float x2, y;

          x2 = l * 0.5F;
          y = l;
          i = Float.floatToRawIntBits(y);
          i = 0x5f3759df - (i >> 1);
          y = Float.intBitsToFloat(i);
          y = y * (1.5F - (x2 * y * y));

          sqrt = (long) (1.0F / y);
        } else {
          sqrt = (long) Math.sqrt(l);
        }
        return sqrt * sqrt == l;
      default:
        return false;
    }
  }

  /**
   * Returns the number of divisors of n (includes both 1 and n)
   */
  public static int countDivisors(int n) {
    // we need the prime factors (a^i, b^j, c^k ...) of n;
    // now the number of divisors is simply (i+i)(j+1)(k+1)...
    // see: http://mathschallenge.net/index.php?section=faq&ref=number/number_of_divisors
    // for a proof
    Map<Integer, Integer> f = factorsWithExponents(n);
    int prod = 1;
    Set<Map.Entry<Integer, Integer>> es = f.entrySet();
    for (Map.Entry<Integer, Integer> e : es) {
      prod *= (e.getValue() + 1);
    }
    return prod;
  }

  /**
   * Returns a list of prime factors of n
   */
  public static List<Integer> factors(int n) {
    List<Integer> factors = new ArrayList<>();
    List<Integer> primes = PrimesFromFile.getIntegerPrimes();
    for (int i : primes) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
      // no need to continue
      if (i > n) break;
    }

    return factors;
  }

  /**
   * Returns a map of prime factors with exponents instead of repeated
   * values
   */
  public static Map<Integer, Integer> factorsWithExponents(int n) {
    List<Integer> factors = factors(n);
    Map<Integer, Integer> f = new HashMap<>(factors.size());
    for (int i : factors) {
      if (f.containsKey(i)) {
        f.put(i, f.get(i) + 1);
      } else {
        f.put(i, 1);
      }
    }
    return f;
  }

  /**
   * The following iterative sequence is defined for the set of positive integers:
   * <p>
   * n → n/2 (n is even)
   * n → 3n + 1 (n is odd)
   * <p>
   * Iterating this sequence (we think) always results in a chain ending in 1.
   * This is an unproven conjecture, but widely thought to be true.
   * <p>
   * This method returns a List of the numbers in the chain stating with the
   * parameter l
   * <p>
   * Note that this is a reasonable implementation if the chains are run
   * independently, but if many chains are the be run at the same time then
   * it would be better to cache the results and so avoid some work.  For my
   * current requirements uncached is fine.
   * <p>
   * WARNING: No attempt is made to avoid overflow (longs are pretty big, but
   * it could happen)...
   *
   * @param l the number from which to start the chain
   * @return a list containing the collatz chain from l to 1
   */
  public static List<Long> collatzChain(long l) {
    // linked list is best (a rare case) here
    List<Long> result = new LinkedList<>();
    result.add(l);
    while (l != 1) {
      if (l % 2 == 0) {
        l = l / 2;
      } else {
        l = (3 * l) + 1;
      }
      result.add(l);
    }
    return result;
  }

  public static long collatzChainLength(long l) {
    return collatzChain(l).size();
  }

  public static BigInteger bigFactorial(int n) {
    assert n >= 0;
    BigInteger f = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      f = f.multiply(BigInteger.valueOf(i));
    }
    return f;
  }

  public static int sumDivisors(int n) {
    // see: http://mathschallenge.net/index.php?section=faq&ref=number/sum_of_divisors
    // get the factorization with exponents
    Map<Integer, Integer> factors = factorsWithExponents(n);
    int prod = 1;
    for (Map.Entry<Integer, Integer> e : factors.entrySet()) {
      int t = (int) (Math.pow(e.getKey(), e.getValue() + 1) - 1) / (e.getKey() -
          1);
      //System.out.println("" + e.getKey() + "^" + e.getValue() + " --> " + t);
      prod *= t;
    }

    return prod;
  }

  /**
   * Proper divisors are the same as all divisors except n is not counted
   */
  public static int sumProperDivisors(int n) {
    return sumDivisors(n) - n;
  }


  public static boolean isPandigital(String s) {
    // sort the digits and compare to "987654321"
    char[] c = s.toCharArray();
    int len = s.length();
    if (len > 9) { return false;}
    Arrays.sort(c);

    return panComps[len].equals(new String(c));
  }

  /**
   * Check for pandigitalness and also for length.  Convenience method
   */
  public static boolean isPandigitalLength(String s, int len) {
    if (s == null || s.length() != len) {
      return false;
    } else {
      return isPandigital(s);
    }
  }

  /**
   * Returns teh greatest common divisor of a and b.
   * Uses euclid's method
   */
  public static long gcd(long a, long b) {
    return (b == 0) ? a : gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(gcd(12, 24));
  }


}
