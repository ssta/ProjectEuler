package ssta.pe.p011_020;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem18 {

  static final String nums = "75\n" +
      "95 64\n" +
      "17 47 82\n" +
      "18 35 87 10\n" +
      "20 04 82 47 65\n" +
      "19 01 23 75 03 34\n" +
      "88 02 77 73 07 63 67\n" +
      "99 65 04 28 06 16 70 92\n" +
      "41 41 26 56 83 40 80 70 33\n" +
      "41 48 72 33 47 32 37 16 94 29\n" +
      "53 71 44 65 25 43 91 52 97 51 14\n" +
      "70 11 33 28 77 73 17 78 39 68 17 57\n" +
      "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
      "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
      "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

  /**
   * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
   * <p>
   * 3
   * 7 4
   * 2 4 6
   * 8 5 9 3
   * <p>
   * That is, 3 + 7 + 4 + 9 = 23.
   * <p>
   * Find the maximum total from top to bottom of the triangle below:
   */
  public String solve() {
    // dynamic programming...
    // slap all the numbers in an array
    int[][] a = new int[15][15];
    Scanner sc = new Scanner(new ByteArrayInputStream(
        nums.getBytes(Charset.forName("UTF-8"))), "UTF-8");
    for (int row = 0; row < 15; row++) {
      String[] b = sc.nextLine().split(" ");
      for (int col = 0; col < b.length; col++) {
        a[row][col] = Integer.parseInt(b[col]);
      }
    }

    for (int row = 13; row >= 0; row--) {
      for (int col = 0; col < 14; col++) {
        a[row][col] = a[row][col] + max(a[row + 1][col], a[row + 1][col + 1]);
      }
    }

    return String.valueOf(a[0][0]);
  }

  int max(int a, int b) {
    return (a > b) ? a : b;
  }
}
