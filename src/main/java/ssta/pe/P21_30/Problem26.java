package ssta.pe.P21_30;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem26 {

  /**
   * .
   * . _snippity_
   * .
   * Find the value of d < 1000 for which 1/d contains the longest recurring
   * cycle in its decimal fraction part.
   */
  public String solve() {
    // stole the idea for this solution from teh PE forum for this problem.
    // Originally I did it brute-forcibly (Which is slow, but works), but this
    // solution (grimbal's) is just so elegant and fast I had to plagiarise it!
    //
    // the solution basically looks at remainders, and notes that if a
    // remainder is seen again that's the sequence.
    int maxn = 0, maxlen = 0;

    for (int n = 2; n <= 1000; n++) {
      int rest = 1;
      int len;
      for (int i = 0; i < n; i++) {
        rest = (rest * 10) % n;
      }
      int r0 = rest;
      len = 0;
      do {
        rest = (rest * 10) % n;
        len++;
      } while (rest != r0);
      if (len > maxlen) {
        maxn = n;
        maxlen = len;
      }
    }


    return String.valueOf(maxn);
  }
}
