package ssta.pe.p071_080;

import ssta.pelib.SimplePrimeSieve;

import java.util.List;

/**


 It is possible to write ten as the sum of primes in exactly five different ways:

 7 + 3
 5 + 5
 5 + 3 + 2
 3 + 3 + 2 + 2
 2 + 2 + 2 + 2 + 2

 What is the first value which can be written as the sum of primes in over five thousand different ways?

 */
public class Problem77 {


  public static void main(String[] args) throws Exception {
    Problem77 p = new Problem77();
    System.out.println(p.solve());
  }

  public String solve() {
    List<Long> p = SimplePrimeSieve.getSieveWithMaxPrime(500).getPrimes();
    int[] primes = new int[p.size()];
    for (int i = 0; i < p.size(); i++) { primes[i] = p.get(i).intValue(); }

    int x = 2;
    while (true) {
      int[] ways = new int[x + 1];
      ways[0] = 1;
      for (int i = 0; i < primes.length; i++) {
        for (int j = primes[i]; j <= x; j++) {
          ways[j] += ways[j - primes[i]];
        }
      }
      if (ways[x] > 5000) { break; }
      x++;
    }
    return String.valueOf(x);
  }
}
