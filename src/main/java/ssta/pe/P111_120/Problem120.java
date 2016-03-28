package ssta.pe.P111_120;

public class Problem120 {

  public static void main(String[] args) {
    System.out.println(new Problem120().solve());
  }

  // after some googling and some algebra turns out this is trivial(ish) sum
  private String solve() {
    long r = 0;
    for (int a = 3; a <= 1000; a++) {
      r += 2 * a * ((a - 1) / 2);
    }
    return String.valueOf(r);
  }

}
