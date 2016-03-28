package ssta.pe.p011_020;

import ssta.pelib.SsMath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem14 {


  static final Map<Long, Long> lengths = new HashMap<>();

  /**
   * Recursively determine the chain length for l
   */
  public static long collatzChainLength(long l) {
    // base case, if l=1 then len=1
    if (l == 1) return 1;
    if (lengths.containsKey(l)) {
      return lengths.get(l);
    } else {
      long new_l = (l % 2 == 0) ? (l / 2) : ((3 * l) + 1);
      long len = 1 + collatzChainLength(new_l);
      // store the length so we can look it up rather than calculate it next
      // time
      lengths.put(l, len);
      return len;
    }
  }

  /**
   * The following iterative sequence is defined for the set of positive integers:
   * <p>
   * n → n/2 (n is even)
   * n → 3n + 1 (n is odd)
   * <p>
   * Using the rule above and starting with 13, we generate the following sequence:
   * <p>
   * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
   * It can be seen that this sequence (starting at 13 and finishing at 1)
   * contains 10 terms. Although it has not been proved yet (Collatz Problem),
   * it is thought that all starting numbers finish at 1.
   * <p>
   * Which starting number, under one million, produces the longest chain?
   * <p>
   * NOTE: Once the chain starts the terms are allowed to go above one million.
   */
  public String solve_orig() {
    // NOTE: This is my initial attempt. It takes over a second to run which
    // I find unacceptably slow, so I'm rewriting it to cache collatz chain
    // lengths rather than generating them to make things faster.
    int max = 0;
    long maxLen = 0;
    for (int i = 1; i < 1000000; i++) {
      long len = SsMath.collatzChainLength(i);
      if (len > maxLen) {
        maxLen = len;
        max = i;
      }
    }
    return String.valueOf(max);
  }

  public String solve() {
    // this version is better (<0.5s, which I find acceptable)
    int max = 0;
    long maxLen = 0;
    for (int i = 1; i < 1000000; i++) {
      long len = collatzChainLength(i);
      if (len > maxLen) {
        maxLen = len;
        max = i;
      }
    }
    return String.valueOf(max);
  }
}
