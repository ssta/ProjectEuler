package ssta.pe.p071_080;

import java.util.ArrayList;
import java.util.List;

/**


 Let p(n) represent the number of different ways in which n coins can be separated into piles. For example, five
 coins can be separated into piles in exactly seven different ways, so p(5)=7.
 OOOOO
 OOOO   O
 OOO   OO
 OOO   O   O
 OO   OO   O
 OO   O   O   O
 O   O   O   O   O

 Find the least value of n for which p(n) is divisible by one million.

 */
public class Problem78 {


  public static void main(String[] args) throws Exception {
    Problem78 p = new Problem78();
    System.out.println(p.solve());
  }

  public String solve() {
    // blindly following the wikipedia article (without really understanding it! :)

    List<Integer> p = new ArrayList<>();
    p.add(1);
    int n = 1;
    while (true) {
      int i = 0;
      int pent = 1;
      p.add(0);
      while (pent <= n) {
        int sign = (i % 4 > 1) ? -1 : 1;
        p.set(n, p.get(n) + (sign * p.get(n - pent)));
        p.set(n, p.get(n) % 1000000);
        i++;

        int j = (i % 2 == 0) ? i / 2 + 1 : -(i / 2 + 1);
        pent = j * (3 * j - 1) / 2;
      }
      if (p.get(n) == 0) {break;}
      n++;
    }

    return String.valueOf(n);
  }
}
