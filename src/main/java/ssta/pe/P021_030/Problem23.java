package ssta.pe.P021_030;

import ssta.pelib.SsMath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem23 {
  public static void main(String[] args) {
    Problem23 p = new Problem23();
    System.out.println(p.solve());
  }

  /**
   * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
   * <p>
   * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
   * <p>
   * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
   * <p>
   * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
   */
  public String solve() {
    int MAX = 28124;
    List<Integer> abundants = getAbundants();
    boolean[] b = new boolean[MAX];

    // slow (n^2) way to do it
    for (int i = 0; i < abundants.size(); i++) {
      //noinspection ForLoopReplaceableByForEach
      for (int j = 0; j < abundants.size(); j++) {
        if (abundants.get(i) + abundants.get(j) > MAX - 1) {
          break;
        } else {
          b[abundants.get(i) + abundants.get(j)] = true;
        }
      }
    }

    long sum = 0;
    for (int i = 0; i < b.length; i++) {
      if (!b[i]) {
        sum += i;
      }
    }

    return String.valueOf(sum);
  }

  private boolean isAbundant(int n) {
    int sd = SsMath.sumProperDivisors(n);
    return sd > n;
  }

  private List<Integer> getAbundants() {
    // returns a list of all abundant numbers up to 28123

    List<Integer> a = new ArrayList<>();
    for (int i = 1; i <= 28123; i++) {
      if (isAbundant(i)) {
        a.add(i);
      }
    }
    return a;
  }
}
