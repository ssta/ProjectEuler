package ssta.pe.p41_50;

import ssta.pelib.RosettaUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.
 * <p>
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 * <p>
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 */
public class Problem43 {
  public static void main(String[] args) throws IOException {

    Problem43 p = new Problem43();
    System.out.println(p.solve());
  }

  public String solve() {
    // this mechanism is slow as slow can be.  Need to find a faster way to do
    // this!
    ArrayList<ArrayList<Integer>> list = RosettaUtils.permutations(RosettaUtils.mRange(0, 9));
    StringBuilder sb;
    long sum = 0L;
    for (ArrayList<Integer> l : list) {
      sb = new StringBuilder();
      l.stream().forEach(sb::append);
      String s = sb.toString();
      if (testString(s)) {
        sum += Long.parseLong(s);
      }
    }

    return String.valueOf(sum);
  }

  private boolean testString(String s) {
    if (subStringIsDivisibleBy(s, 2, 2, 4)) {
      if (subStringIsDivisibleBy(s, 3, 3, 5)) {
        if (subStringIsDivisibleBy(s, 5, 4, 6)) {
          if (subStringIsDivisibleBy(s, 7, 5, 7)) {
            if (subStringIsDivisibleBy(s, 11, 6, 8)) {
              if (subStringIsDivisibleBy(s, 13, 7, 9)) {
                if (subStringIsDivisibleBy(s, 17, 8, 10)) {
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  private boolean subStringIsDivisibleBy(String s, int div, int start, int end) {
    int i = Integer.parseInt(s.substring(start - 1, end));
    return i % div == 0;
  }

}
