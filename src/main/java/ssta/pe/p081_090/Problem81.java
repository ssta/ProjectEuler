/*
 * Copyright (c) 2001-2016 HPD Software Ltd.
 */
package ssta.pe.p081_090;

import java.util.Scanner;

/** NOTE: I prepared the file by replacing commas with spaces to make for easier parsing...
 * ssta.pe.p81_90.Problem81, created on 01/03/2016 15:01 <p>
 * @author StephenSt
 */
public class Problem81 {
  public static void main(String[] args) {
    System.out.println(new Problem81().solve());
  }

  public String solve() {
    // read the file...
    int[][] matrix = new int[80][80];
    Scanner sc = new Scanner(this.getClass().getResourceAsStream("/p081_matrix.txt"));
    // read the matrix from file
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // get the "edges" done first...
    for (int i = matrix.length - 2; i >= 0; i--) {
      matrix[matrix.length - 1][i] += matrix[matrix.length - 1][i + 1];
      matrix[i][matrix.length - 1] += matrix[i + 1][matrix.length - 1];
    }

    // now the rest of the matrix
    for (int i = matrix.length - 2; i >= 0; i--) {
      for (int j = matrix[i].length - 2; j >= 0; j--) {
        matrix[i][j] += min(matrix[i + 1][j], matrix[i][j + 1]);
      }
    }

    return String.valueOf(matrix[0][0]);
  }

  private int min(int a, int b) {
    return a < b ? a : b;
  }
}
