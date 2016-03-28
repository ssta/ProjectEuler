package ssta.pe.p031_040;

import ssta.pelib.PrimesFromFile;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ssta on 17/05/15.
 */
public class Problem35 {
  // global evilness, but simplifies life
  TreeSet<Integer> primes = new TreeSet<>();

  public static void main(String[] args) {
    System.out.println(new Problem35().solve());
  }

  /**
   * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
   * <p>
   * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
   * <p>
   * How many circular primes are there below one million?
   */
  public String solve() {
    primes.addAll(PrimesFromFile.getIntegerPrimes());
    int MAX = 1000000;
    // the problem statement gives us the answer for n<100, so we just take that
    // rather than needing to recompute it
    int count = 13;
    boolean[] done = new boolean[MAX];
    // 0 through 99 are 'done', so mark them
    for (int i = 0; i < 100; i++) { done[i] = true;}
    for (int n = 100; n < MAX; n++) {
      // avoid redoing any we've already done
      if (done[n]) {continue;}
      Set<Integer> rot = getRotations(n);
      boolean allPrime = true;
      for (int i : rot) {
        if (!isPrime(i)) {
          allPrime = false;
        }
        done[i] = true;
      }
      if (allPrime) {
        count += rot.size();
      }

    }
    return String.valueOf(count);
  }

  private boolean isPrime(int i) {
    return primes.contains(i);
  }

  private Set<Integer> getRotations(int n) {
    Set<Integer> r = new HashSet<>();
    r.add(n);

    // how many times to loop
    int l = (int) Math.floor(Math.log10(n));
    int p = (int) Math.pow(10, l);
    for (int i = 0; i < l; i++) {
      int right = n % 10;
      n /= 10;
      n += (right * p);
      r.add(n);
    }
    return r;
  }

}
