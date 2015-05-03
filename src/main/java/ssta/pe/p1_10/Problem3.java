package ssta.pe.p1_10;

import java.util.Set;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem3 {
  /**
   * The prime factors of 13195 are 5, 7, 13 and 29.
   * <p>
   * What is the largest prime factor of the number 600851475143 ?
   */
  public String solve() {
    long n = 600851475143L;
    // trial division is fast enough for a number this small...
    for (int i = 3; i < n && i < n; i += 2) {
      while (n % i == 0) { n /= i;}
    }
    String result = String.valueOf(n);
    return result;
  }
}
