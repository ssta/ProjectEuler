package ssta.pe.P111_120;

import java.util.List;

class Problem123 {
  
  public static void main(String[] args) {
    System.out.println(new Problem123().solve());
  }

  // Very similar to P120, so we can leverage the same closed form for the remainder we used there
  private String solve() {

    List<Integer> primes = ssta.pelib.PrimesFromFile.getIntegerPrimes();
    int n=3;
    while(true) {
      long r = 2L * primes.get(n-1) * n;
      
      if (r >= 10000000000L) {
        return String.valueOf(n);
      }
      n+=2;
    }
  }

}
