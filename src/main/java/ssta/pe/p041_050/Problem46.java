package ssta.pe.p041_050;

import ssta.pelib.PrimesFromFile;

import java.util.List;

/**
 * It was proposed by Christian Goldbach that every odd composite number can
 * be written as the sum of a prime and twice a square.
 * <p>
 * 9 = 7 + 2×12
 * 15 = 7 + 2×22
 * 21 = 3 + 2×32
 * 25 = 7 + 2×32
 * 27 = 19 + 2×22
 * 33 = 31 + 2×12
 * <p>
 * It turns out that the conjecture was false.
 * <p>
 * What is the smallest odd composite that cannot be written as the sum of a
 * prime and twice a square?
 */
class Problem46 {

  public static void main(String[] args) {

    Problem46 p = new Problem46();
    System.out.println(p.solve());
  }

  private static boolean isTwiceSquare(int n) {
    double t = Math.sqrt(n / 2);
    return t == (int) t;
  }


  public String solve() {

    List<Integer> primes = PrimesFromFile.getIntegerPrimes();
    // brute force it...
    // iterate over the odd numbers
    // then for each prime smaller than it test if the difference is twice a
    // square.  If it is then go to the next odd number, if not then go to
    // the next prime.  If we get to primes higher than n and haven't found a
    // result then n is the answer...

    int n = 1;
    boolean done = false;
    while (!done) {
      n += 2;
      // if n is prime go to the next n
      if (primes.contains(n)) {
        continue;
      }
      for (int p : primes) {
        if (p > n) {
          done = true;
          break;
        } else if (isTwiceSquare(n - p)) {
          break;
        }
      }

    }

    return String.valueOf(n);
  }
}
