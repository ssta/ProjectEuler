package ssta.pe.p041_050;

import java.io.IOException;

/**
 * Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
 * <p>
 * Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
 * Pentagonal	 	Pn=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
 * Hexagonal	 	Hn=n(2n−1)	 	1, 6, 15, 28, 45, ...
 * It can be verified that T285 = P165 = H143 = 40755.
 * <p>
 * Find the next triangle number that is also pentagonal and hexagonal.
 * Created by ssta on 02/01/16.
 */
public class Problem45 {

  public static void main(String[] args) throws IOException {

    Problem45 p = new Problem45();
    System.out.println(p.solve());
  }

  /**
   * Returns the nth triangle number
   */
  private long tri(long n) {
    return n * (n + 1) / 2;
  }

  /**
   * Returns true IFF n is pentagonal
   */
  private boolean isPentagonal(long n) {
    double t = (Math.sqrt(1 + 24 * n) + 1.0) / 6.0;
    return t == (long) t;
  }

  /**
   * Returns true IFF n is hexagonal
   */
  private boolean isHexagonal(long n) {
    double t = (Math.sqrt(1 + 8 * n) + 1.0) / 4.0;
    return t == (long) t;
  }

  public String solve() {
    /* The problem description tells us that it's bigger than T(285), so
     * start there...
     */
    for (long i = 286; i > 0; i++) {
      long t = tri(i);
      if (isPentagonal(t) && isHexagonal(t)) {
        return String.valueOf(t);
      }
    }

    return String.valueOf(0);
  }
}