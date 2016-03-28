package ssta.pe.p001_010;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem5 {
  /**
   * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   * <p>
   * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */
  public String solve() {
    // this is just the product of the distinct prime factors os the numbers
    // 1..20.
    long r = 2; // 2
    r *= 3; // 3
    r *= 2; // 4
    r *= 5;// 5
    // 6
    r *= 7;// 7
    r *= 2;// 8
    r *= 3;// 9
    // 10
    r *= 11;// 11
    // 12
    r *= 13;// 13
    // 14
    // 15
    r *= 2;// 16
    r *= 17;// 17
    // 18
    r *= 19;// 19
    // 20

    String result = String.valueOf(r);
    return result;
  }
}
