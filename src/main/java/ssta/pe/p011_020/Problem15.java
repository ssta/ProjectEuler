package ssta.pe.p011_020;

import ssta.pelib.SsMath;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem15 {

  /** Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
   *
   * How many such routes are there through a 20×20 grid?
   */
  public String solve() {
    // trivial problem when you realise that this is a combinatorical problem
    // for any n*n grig, the answer is 2n!/n!^2
    // it's most easily seen by examining small grid sizes and recognising
    // the relationshiop to pascal's triangle.  The number of ways in an n*n
    // grid is the nth element in the 2*nth row of Pascal's triangle
    //
    // since we're only dealing with small(ish) numbers, we'll do the
    // factorials naively
    int ROWS = 20;
    BigInteger a = SsMath.bigFactorial(ROWS*2);
    BigInteger b = SsMath.bigFactorial(ROWS);
    BigInteger c = b.multiply(b);
    BigInteger d = a.divide(c);
    return d.toString();
  }
}
