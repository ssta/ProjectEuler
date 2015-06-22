package ssta.pe.p41_50;

import ssta.pelib.PrimesFromFile;
import ssta.pelib.SsMath;

import java.util.List;
import java.util.stream.Collectors;

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
 * <p>
 * What is the largest n-digit pandigital prime that exists?
 */
public class Problem41 {
  public static void main(String[] args) {
    Problem41 p = new Problem41();
    System.out.println(p.solve());
  }

  public String solve() {
    /* Trivially easy to see that the answer is liable to be 7 digits long
     (5, 6, 8 and 9 digit pandigitals are always divisible by 3).
     Grab a pile of 7-digit primes and brute-force (backwards).  There may be
      a Better Way[tm] but this way works fine.
     */
    List<Integer> primes = PrimesFromFile.getIntegerPrimes()
        .parallelStream()
        .filter(x -> x > 1000000)
        .filter(x -> x < 10000000)
        .collect(Collectors.toList());

    int p = 0;
    for (int i = primes.size() - 1; i > 0; i--) {
      if (SsMath.isPandigital(String.valueOf(primes.get(i)))) {
        p = primes.get(i);
        break;
      }
    }

    return String.valueOf(p);
  }

}
