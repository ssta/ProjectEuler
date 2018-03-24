package ssta.pe.p041_050;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
 * <p>
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * <p>
 * By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.
 * <p>
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
 */
class Problem42 {
  public static void main(String[] args) {
    Problem42 p = new Problem42();
    System.out.println(p.solve());
  }

  public String solve() {
    /* THe largest score of any word in that file is 192, so we can just
    hardwire the triangular numbers */
    Set<Integer> tr = new HashSet<>(Arrays.asList(0, 1, 3, 6, 10, 15, 21, 28, 36, 45,
        55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210));

    Scanner sc = new Scanner(ClassLoader.getSystemResourceAsStream
        ("p042_words.txt"), "UTF-8");
    int count = 0;
    while (sc.hasNextLine()) {
      String s = sc.nextLine().trim();
      int n = wordNum(s);
      //System.out.println(s + "::" + n);
      if (tr.contains(n)) {
        count++;
      }
    }

    return String.valueOf(count);
  }

  private int wordNum(String s) {
    int n = 0;
    for (char c : s.toCharArray()) {
      n += (c - 'A' + 1);
    }
    return n;
  }

}
