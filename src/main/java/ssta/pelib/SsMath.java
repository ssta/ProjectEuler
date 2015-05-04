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

  /**
   * Return true iff the argument is a perfect square
   */
  public static boolean isPerfectSquare(long l) {
    // the switch is a hack to instantly reject over 80% of possibilities
    // since the last 6 bots aof any perfect square must be one of the
    // cases.  There are only 12 of them out of 64 possible values.
    switch ((int) (l & 0x3F)) {
      case 0x00:
      case 0x01:
      case 0x04:
      case 0x09:
      case 0x10:
      case 0x11:
      case 0x19:
      case 0x21:
      case 0x24:
      case 0x29:
      case 0x31:
      case 0x39:
        long sqrt;
        if (l < 410881L) {
          // John Carmack's (very fast and mysterious 'magic number' hack)
          // it can fail for numbers larger than 410881L (because of float
          // precision) it probably works if you use doubles, but doubles are
          // (slightly) slower
          int i;
          float x2, y;

          x2 = l * 0.5F;
          y = l;
          i = Float.floatToRawIntBits(y);
          i = 0x5f3759df - (i >> 1);
          y = Float.intBitsToFloat(i);
          y = y * (1.5F - (x2 * y * y));

          sqrt = (long) (1.0F / y);
        } else {
          sqrt = (long) Math.sqrt(l);
        }
        return sqrt * sqrt == l;
      default:
        return false;
    }
  }
}
