package ssta.pe.P091_100;

/**
 * Created by ssta on 05/03/16.
 */
public class Problem100 {
  public static void main(String[] args) {
    System.out.println(new Problem100().solve());
  }


  private String solve() {
  /* After some research, and some algebra, the solutions to this for any n
    is the solution to the diophanitne equation:
      2(b^2) - 2b -n^2 +n = 0.

    After significantly more research andf without me really understanding
    why (mathematica website isn't the best ever at explaining stuff), turns
    out that this can be solved for any n with the following recurrence
    relations:
      b_{k+1} = 3b_{k} + 2n_{k} - 2
      n_{k+1} = 4b_{k} + 3n_{k} - 3

    Where b is the number of blue disks in the next solution and n is the
    total number of disks.

    This is trivial (and FAST) to implement:
     */

    long b = 15;
    long n = 21;
    long goal = 1000000000000L;
    while (n < goal) {
      long b2 = (3 * b) + (2 * n) - 2;
      long n2 = (4 * b) + (3 * n) - 3;
      b = b2;
      n = n2;
      System.out.printf("Found solution: blue: %d\t\ttotal: %d%n", b, n);
    }

    return String.valueOf(b);
  }
}
