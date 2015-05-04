package ssta.pelib;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ssta on 04/05/15.
 */
public class PrimesFromFile {

  private static List<Long> primes;
  private static List<Long> bigPrimes;

  public static List<Long> getPrimes() {
    if (primes == null) {loadPrimes();}
    return primes;
  }

  private static void loadPrimes() {
    primes = new ArrayList<>();
    InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream
        ("Primes.txt");
    Scanner sc = new Scanner(is);
    while (sc.hasNextLong()) {
      primes.add(sc.nextLong());
    }
  }
}
