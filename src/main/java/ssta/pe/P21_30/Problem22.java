package ssta.pe.P21_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem22 {
  /**
   * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
   * containing over five-thousand first names, begin by sorting it into
   * alphabetical order. Then working out the alphabetical value for each name,
   * multiply this value by its alphabetical position in the list to obtain a
   * name score.
   * <p>
   * For example, when the list is sorted into alphabetical order, COLIN, which
   * is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So,
   * COLIN would obtain a score of 938 × 53 = 49714.
   * <p>
   * What is the total of all the name scores in the file?
   */
  public String solve() {
    // I've cheated a little by premassaging the list to make it 1 name per
    // line rather than CSV.  I still do the reading/sorting in java...
    // cat/tr is easier
    Scanner sc = new Scanner(ClassLoader.getSystemResourceAsStream
        ("p022_names.txt"));
    TreeSet<String> nameSet = new TreeSet<>();
    while (sc.hasNextLine()) {
      nameSet.add(sc.nextLine().trim());
    }
    // make the set a list so we have indices
    List<String> nameList = new ArrayList<>(nameSet);

    long sum = 0;
    for (int i = 0; i < nameList.size(); i++) {
      if (nameList.get(i).length() > 0) {
        int score = scoreName(nameList.get(i));
        sum += (score * (i + 1));
      }
    }
    return String.valueOf(sum);
  }

  private int scoreName(String s) {
    int sum = 0;
    for (char c : s.toCharArray()) {
      sum += (c - 'A' + 1);
    }
    return sum;
  }
}
