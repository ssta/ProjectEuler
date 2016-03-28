package ssta.pe.p031_040;

/**
 * An irrational decimal fraction is created by concatenating the positive integers:
 * <p>
 * 0.123456789101112131415161718192021...
 * <p>
 * It can be seen that the 12th digit of the fractional part is 1.
 * <p>
 * If dn represents the nth digit of the fractional part, find the value of the following expression.
 * <p>
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 */
public class Problem40 {
  public static void main(String[] args) {
    Problem40 p = new Problem40();
    System.out.println(p.solve());
  }

  public String solve() {
    /*
    This is easy with pen+paper, but it's a small enough problem that this
    evil hack is good enough!
     */

    StringBuilder sb = new StringBuilder(".");
    for (int i = 1; i <= 1000000; i++) {
      sb.append(i);
    }

    int i = 1;
    int prod = 1;
    while (i <= 1000000) {
      prod *= sb.charAt(i) - '0';
      i *= 10;
    }

    return String.valueOf(prod);
  }

}
