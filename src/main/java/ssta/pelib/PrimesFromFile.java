package ssta.pelib;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ssta on 04/05/15.
 */
public class PrimesFromFile {

  private static List<Long> longPrimes;
  private static List<Integer> intPrimes;

  public static List<Long> getLongPrimes() {
    if (longPrimes == null) {loadPrimes();}
    return longPrimes;
  }

  /**
   * Return only those longPrimes which fit in an int
   */
  public static List<Integer> getIntegerPrimes() {
    if (intPrimes == null) {
      List<Long> lp = getLongPrimes();
      List<Integer> ip = new ArrayList<>();
      for (long l : longPrimes) {
        if (l < Integer.MAX_VALUE) {
          ip.add((int) l);
        }
      }
      intPrimes = ip;
    }
    return intPrimes;
  }

  private static void loadPrimes() {
    longPrimes = new ArrayList<>();
    InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream
        ("Primes.txt");
    Scanner sc = new Scanner(is);
    while (sc.hasNextLong()) {
      longPrimes.add(sc.nextLong());
    }
  }
}
