package ssta.pe.p031_040;

import ssta.pelib.SsMath;

/**
 * Created by ssta on 17/05/15.
 */
class Problem38 {
  public static void main(String[] args) {
    Problem38 p = new Problem38();
    System.out.println(p.solve());
  }

  /**
   * Take the number 192 and multiply it by each of 1, 2, and 3:
   * <p>
   * 192 × 1 = 192
   * 192 × 2 = 384
   * 192 × 3 = 576
   * By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
   * <p>
   * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
   * <p>
   * What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?
   */
  public String solve() {
    // 2 minutes with pencil and paper will convince you we're looking for a 4
    // digit number, and since we want the largest, we can start at 9999 and
    // decrement until we find the one
    int i = 9999;
    // just in case, although we'll stop LONG before this!
    while (i > 1000) {
      int i1 = i;
      int i2 = i * 2;
      String s = String.valueOf(i1) + String.valueOf(i2);
      if (SsMath.isPandigital(s)) {
        return s;
      }
      i--;
    }
    // we'll never get here
    return String.valueOf(0);
  }

}
