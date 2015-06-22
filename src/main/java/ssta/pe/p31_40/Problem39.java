package ssta.pe.p31_40;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.*;

/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
 * <p>
 * {20,48,52}, {24,45,51}, {30,40,50}
 * <p>
 * For which value of p ≤ 1000, is the number of solutions maximised?
 * <p>
 * <p>
 * Created by ssta on 17/05/15.
 */
@SuppressFBWarnings({"WMI_WRONG_MAP_ITERATOR"})
public class Problem39 {
  public static void main(String[] args) {
    Problem39 p = new Problem39();
    System.out.println(p.solve());
  }

  public String solve() {
    int maxperim = 0;
    int maxcount = 0;

    Map<Integer, Set<List<Integer>>> triples = new HashMap<>();
    for (int i = 1; i <= 1000; i++) {
      Set<List<Integer>> s = new HashSet<>();
      triples.put(i, s);
    }

    // evil brute-force method
    for (int a = 3; a < 500; a++) {
      for (int b = 3; b < 500; b++) {
        int c = (int) Math.sqrt((a * a) + (b * b));
        if ((c * c) == (a * a) + (b * b)) {
          if (a + b + c <= 1000) {
            Integer[] triple = sort3(a, b, c);
            // System.out.println("Found triple: " + Arrays.toString(triple));
            int perim = a + b + c;
            List<Integer> t = Arrays.asList(triple);
            triples.get(perim).add(t);
          }
        }
      }
    }

    for (int i : triples.keySet()) {
      if (triples.get(i).size() > maxcount) {
        maxperim = i;
        maxcount = triples.get(i).size();
      }
    }

    return String.valueOf(maxperim);
  }

  private Integer[] sort3(Integer... a) {
    Arrays.sort(a);
    return a;
  }

}
