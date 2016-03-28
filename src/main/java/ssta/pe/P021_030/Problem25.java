package ssta.pe.P021_030;

import java.math.BigInteger;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem25 {

  /**
   * The Fibonacci sequence is defined by the recurrence relation:
   * <p>
   * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
   * .
   * . _snippity_
   * .
   * The 12th term, F12, is the first term to contain three digits.
   * <p>
   * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
   */
  public String solve() {
    BigInteger f1 = BigInteger.ONE;
    BigInteger f2 = BigInteger.ONE;
    int i = 3;
    while (true) {
      BigInteger t = f1;
      f1 = f2;
      f2 = t.add(f1);
      if (f2.toString().length() > 999) {
        break;
      }
      i++;
    }
    return String.valueOf(i);
  }
}
