package ssta.pe.p041_050;

import java.io.IOException;
import java.math.BigInteger;

/**
 * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
 * <p>
 * Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */
public class Problem48 {

  public static void main(String[] args) throws Exception {
    Problem48 p = new Problem48();
    System.out.println(p.solve());
  }


  public String solve() throws IOException, InterruptedException {
    BigInteger mod = BigInteger.valueOf(10000000000L);
    // this is just a long loop of modular arithmetic...
    BigInteger b = BigInteger.ONE;
    for (int i = 2; i <= 1000; i++) {
      BigInteger bi = BigInteger.valueOf(i);
      bi = bi.pow(i);
      bi = bi.add(b);
      b = bi.mod(mod);
    }

    return b.toString();
  }
}
