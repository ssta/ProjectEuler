package ssta.pe.P21_30;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem30 {

  /**
   * Surprisingly there are only three numbers that can be written as the sum
   * of fourth powers of their digits:
   * <p>
   * 1634 = 14 + 64 + 34 + 44
   * 8208 = 84 + 24 + 04 + 84
   * 9474 = 94 + 44 + 74 + 44
   * As 1 = 14 is not a sum it is not included.
   * <p>
   * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
   * <p>
   * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
   */
  public String solve() {
    // since the maximum possible value for one digit is 9^5 (59049), we know
    // that 5 digit numbers can qualify (5*9^5=295245), so possible.
    // 6 digit numbers: 354294 barely qualify, but some of them might.
    // 7 digit numbers: 413343 is only 6 digits, so definitely will NOT qualify!
    // Thus we can set an upper bound of 999999.  I Imagine with some further
    // analysis it's possible to reduce this bound, but it will do to start
    // with,
    //
    // hardwire the powers of 5 for each digit (faster thasn recalculating
    // them a million times).
    int[] p5 = {0, 1, 32, 243, 1024, 3125, 7776, 16807, 32768, 59049};
    int total = 0;

    for (int i = 2; i < 999999; i++) {
      int sum = 0;
      int n = i;
      while (n > 0) {
        sum += p5[n % 10];
        n /= 10;
      }
      if (sum == i) {
        total += i;
      }
    }

    return String.valueOf(total);
  }
}
