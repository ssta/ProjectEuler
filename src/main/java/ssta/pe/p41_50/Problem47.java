package ssta.pe.p41_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * The first two consecutive numbers to have two distinct prime factors are:
 * <p>
 * 14 = 2 × 7
 * 15 = 3 × 5
 * <p>
 * The first three consecutive numbers to have three distinct prime factors are:
 * <p>
 * 644 = 2² × 7 × 23
 * 645 = 3 × 5 × 43
 * 646 = 2 × 17 × 19.
 * <p>
 * Find the first four consecutive integers to have four distinct prime factors. What is the first of these numbers?
 */
public class Problem47 {

  public static void main(String[] args) throws Exception {

    Problem47 p = new Problem47();
    System.out.println(p.solve());
  }

  private int countDistinct(String nums) {
    Set<String> set = new HashSet<>();
    // remove everything before the :
    String[] s = nums.split(" ");
    for (String num : s) {
      set.add(num);
    }
    return set.size();
  }

  public String solve() throws IOException, InterruptedException {
    // cheat like buggery and use factor(1) (faster than doing it in java)
    // the file factors.txt is the ouyput of: factor 2 200000 (took 0.2s to run)

    InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream
        ("factors.txt");
    HashMap<Integer, Integer> countDistinctFactors = new HashMap<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    String line;
    while ((line = br.readLine()) != null) {
      String[] s = line.split(":");
      countDistinctFactors.put(Integer.valueOf(s[0]), countDistinct(s[1].trim()));
    }
    for (int i = 2; i < 200000; i++) {
      if ((countDistinctFactors.get(i) == 4) &&
          (countDistinctFactors.get(i + 1) == 4) &&
          (countDistinctFactors.get(i + 2) == 4) &&
          (countDistinctFactors.get(i + 3) == 4)) {
       /* System.out.printf("%d has 4 distinct prime factors " +
                "and %d also has 4 distinct prime factors" +
                "and %d also has 4 distinct prime factors" +
                "and %d also has 4 distinct prime factors\n",
            i, i + 1, i + 2, i + 3);*/
        return String.valueOf(i);
      }
    }
    return String.valueOf(0);
  }
}
