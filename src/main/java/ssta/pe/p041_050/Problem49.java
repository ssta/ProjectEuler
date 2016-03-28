package ssta.pe.p041_050;

import ssta.pelib.PrimesFromFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms
 * increases by 3330, is unusual in two ways: (i) each of the three terms are
 * prime, and, (ii) each of the 4-digit numbers are permutations of one another.
 * <p>
 * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes,
 * exhibiting this property, but there is one other 4-digit increasing sequence.
 * <p>
 * What 12-digit number do you form by concatenating the three terms in this
 * sequence?
 */
public class Problem49 {

  List<Integer> primes = PrimesFromFile.getIntegerPrimes();

  public static void main(String[] args) throws Exception {
    Problem49 p = new Problem49();
    System.out.println(p.solve());
  }

  private String sortDigits(int n) {
    char[] chars = String.valueOf(n).toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }


  private boolean isPrime(int n) {
    return primes.contains(n);
  }

  public String solve() throws IOException, InterruptedException {
    // Turns out that the answer also is increasing by 3330 (weird, but true)
    // which allows for a significant optimisation...

    for (int p : primes) {
      // only want to look at 4 digit primes.
      if (p < 1000) {continue;}
      // we don't want to repeat the one the question gives us...
      if (p == 1487) {continue;}
      if (isPrime(p + 3330) && isPrime(p + 6660)) {
        if (sortDigits(p).equals(sortDigits(p + 3330)) &&
            sortDigits(p).equals(sortDigits(p + 6660)))
          //System.out.println("Found : " + p);
          return String.valueOf(p).concat(String.valueOf(p + 3330)).concat(String
              .valueOf(p + 6660));
      }
    }

    return "0";
  }
}
