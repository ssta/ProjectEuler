package ssta.pelib;

/**
 * Created by ssta on 03/05/15.
 */
public class SsMath {
  /**
   * return the ith triangle number
   */
  public static long triangle(long i) {
    return (i * (i + 1)) / 2;
  }

  /**
   * Return the ith square pyramidal number (sum_{1..i} i^2)
   */
  public static long sqPyramidal(long i) {
    return (i * (i + 1) * (2 * i + 1)) / 6;
  }

  /**
   * Return the square of the ith triangle number
   */
  public static long sqSum(long i) {
    return triangle(i) * triangle(i);
  }
}
