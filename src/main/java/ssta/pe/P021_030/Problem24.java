package ssta.pe.P021_030;

import ssta.pelib.RosettaUtils;

import java.util.ArrayList;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem24 {

  /**
   * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
   * <p>
   * 012   021   102   120   201   210
   * <p>
   * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
   */
  public String solve() {
    // stole some code from Rosetta for this...writing a non-buggy permuter
    // is a bitch!
    ArrayList<ArrayList<Integer>> list = RosettaUtils.permutations(RosettaUtils.mRange(0, 9));
    final StringBuilder sb = new StringBuilder();
    String r = "";
    list.get(999999).stream().forEach(sb::append);

    return sb.toString();
  }
}
