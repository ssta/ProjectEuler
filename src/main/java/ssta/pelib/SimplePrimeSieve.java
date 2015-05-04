package ssta.pelib;

import java.util.ArrayList;
import java.util.List;

/**
 * Horrifically slow sieve, but very simple to implement and fast enough for
 * small values.  For harder stuff use a wheel.
 * Created by ssta on 04/05/15.
 */
public class SimplePrimeSieve {
  private List<Long> primes = new ArrayList<>();

  /**
   * Get the first maxSize primes
   */
  public static SimplePrimeSieve getSieveWithMaxPrime(int maxSize) {
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

  public List<Long> getPrimes() {
    return primes;
  }
}
