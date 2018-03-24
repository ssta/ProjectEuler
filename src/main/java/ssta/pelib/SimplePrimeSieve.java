package ssta.pelib;

import com.google.common.base.Stopwatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Horrifically slow sieve, but very simple to implement and fast enough for
 * small values.  For harder stuff use a wheel.
 * Created by ssta on 04/05/15.
 */
public class SimplePrimeSieve {
  private final List<Long> primes = new ArrayList<>();

  /**
   * Generate primes up to (and including) maxPrime
   */
  public static SimplePrimeSieve getSieveWithMaxPrime(long maxPrime) {
    SimplePrimeSieve sps = new SimplePrimeSieve();
    OUTERLOOP:
    for (long l = 2; l <= maxPrime; l++) {
      for (Long p : sps.getPrimes()) {
        if (l % p == 0) {
          continue OUTERLOOP; // not prime
        }
      }
      // yes prime, add to list
      sps.getPrimes().add(l);
    }

    return sps;
  }

  /**
   * Get the first maxSize primes
   */
  public static SimplePrimeSieve getSieveWithMaxListSize(int maxSize) {
    SimplePrimeSieve sps = new SimplePrimeSieve();
    OUTERLOOP:
    for (long l = 2; sps.getPrimes().size() < maxSize; l++) {
      for (Long p : sps.getPrimes()) {
        if (l % p == 0) {
          continue OUTERLOOP; // not prime
        }
      }
      // yes prime, add to list
      sps.getPrimes().add(l);

    }

    return sps;
  }

  public static void main(String[] args) {
    Stopwatch sw = Stopwatch.createStarted();
    List<Long> p = SimplePrimeSieve.getSieveWithMaxPrime(2000000).getPrimes();
    System.out.println(p.size());
    System.out.println(sw.stop());
  }

  public List<Long> getPrimes() {
    return primes;
  }
}
