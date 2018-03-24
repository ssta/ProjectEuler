package ssta.pe.p031_040;

/**
 * Created by ssta on 17/05/15.
 */
class Problem34 {
  // hardwire 0!..9! to avoid needing to compute them -- significant speedup!
  private static final int[] facts = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

  /**
   * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
   * <p>
   * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
   * <p>
   * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
   */
  public String solve() {
    // 9999999 is a trivial upper bound as 9!=362880 and so 7*9!<9999999
    // It might be poissible to have a better upper bound, but I'm not
    // motivated to spend enprmous time finding the best upper bound
    // possible :)
    int MAX = 9999999;
    int sum = 0;
    for (int i = 10; i < MAX; i++) {
      int j = sumFactDigits(i);
      if (i == j) {
        sum += i;
      }
    }
    return String.valueOf(sum);
  }

  private int sumFactDigits(int i) {
    char[] digits = String.valueOf(i).toCharArray();
    int sum = 0;
    for (char c : digits) {
      sum += facts[c - '0'];
    }
    return sum;
  }
}
