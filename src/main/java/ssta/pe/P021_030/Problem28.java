package ssta.pe.P021_030;

/**
 * Created by ssta on 03/05/15.
 */
class Problem28 {

  /**
   * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
   * <p>
   * 21 22 23 24 25
   * 20  7  8  9 10
   * 19  6  1  2 11
   * 18  5  4  3 12
   * 17 16 15 14 13
   * <p>
   * It can be verified that the sum of the numbers on the diagonals is 101.
   * <p>
   * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
   */
  public String solve() {
    // note that the 'corners' of each n*n square (with n always odd) is
    // given by one of the 4 formulae:
    // (top right) n^2
    // (top left)  n^2-n+1
    // (bottom left) n^2-2n+2
    // (bottom right) n^2-3n+3
    //
    // sum these to get 4n^2-6n+6, which is the "total" of the 4 corners for
    // each 'square'
    //
    // add the 1 in the middle seperately...
    long sum = 1; // the centre 1
    for (int n = 3; n <= 1001; n += 2) {
      long t = (4 * n * n) - (6 * n) + 6;
      sum += t;
    }

    return String.valueOf(sum);
  }
}
