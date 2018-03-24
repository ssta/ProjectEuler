package ssta.pe.P071_080;

import ssta.pelib.SsMath;

/**
 * Created by ssta on 13/01/16.
 */
class P75 {
  public static void main(String[] args) {
    System.out.println(new P75().solve());
  }

  private String solve() {
    final long MAX = 1500000;

    // to hold a count of each perimeter found
    int[] found = new int[1500001];

    // Euclid's method for triple generation
    // max m is sqrt(MAX) - actually you COULD find a smaller bound, but this
    // one works fine
    long maxm = (long) Math.sqrt(MAX);

    // use longs to avoid overflow (cheap and nasty, but easier and faster
    // than more primitive bounds checking...)
    for (long m = 2; m < maxm; m++) {
      for (long n = 1; n < m; n++) {
        if ((n + m) % 2 == 1 && SsMath.gcd(m, n) == 1) {
          // the primitive from this m,n:
          long a = (m * m) + (n * n);
          long b = (m * m) - (n * n);
          long c = 2 * m * n;
          long p = a + b + c;
          while (p <= MAX) {
            // now increment all "triangles" of size p
            found[(int) p] = found[(int) p] + 1;
            // now try multiples of the perimeter
            p += a + b + c;
          }
        }
      }
    }

    // count up how many we found
    int result = 0;
    for (int i : found) {
      if (i == 1) result++;
    }

    return String.valueOf(result);
  }
}
