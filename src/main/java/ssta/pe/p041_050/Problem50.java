package ssta.pe.p041_050;

import ssta.pelib.PrimesFromFile;

import java.util.List;

public class Problem50 {
  private static final int LIMIT = 1_000_000;

  public static void main(String[] args) {
    System.out.println(new Problem50().solve());
  }

  public String solve() {
    List<Integer> primes = PrimesFromFile.getIntegerPrimes();
    int maxsum = 0;
    int maxrun = -1;

    for (int i = 0; i < primes.size(); i++) {
      int sum = 0;
      for (int j = i; j < primes.size(); j++) {
        sum += primes.get(j);
        if (sum > LIMIT) {
          break;
        } else if (j - i > maxrun && sum > maxsum && primes.contains(sum)) {
          maxsum = sum;
          maxrun = j - i;
        }
      }
    }
    return String.valueOf(maxsum);
  }
}
