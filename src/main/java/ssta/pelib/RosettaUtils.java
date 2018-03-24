package ssta.pelib;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Stolen from: http://rosettacode.org/wiki/User:Margusmartsepp/Contributions/Java/Utils.java
 * Created by ssta on 10/05/15.
 */
public class RosettaUtils {
  private static <T> void swap(ArrayList<T> data, int i, int j) {
    T t = data.get(i);
    data.set(i, data.get(j));
    data.set(j, t);
  }

  private static <T extends Comparable<? super T>> boolean nextPerm(ArrayList<T> data) {
    // find the swaps
    int c = -1, d = data.size();
    for (int i = d - 2; i >= 0; i--)
      if (data.get(i).compareTo(data.get(i + 1)) < 0) {
        c = i;
        break;
      }

    if (c < 0)
      return false;

    int s = c + 1;
    for (int j = c + 2; j < d; j++)
      if (data.get(j).compareTo(data.get(s)) < 0 && //
          data.get(j).compareTo(data.get(c)) > 0)
        s = j;

    // do the swaps
    swap(data, c, s);
    while (--d > ++c)
      swap(data, c, d);

    return true;
  }

  public static <T extends Comparable<? super T>> ArrayList<ArrayList<T>> permutations(ArrayList<T> d) {
    ArrayList<ArrayList<T>> result = new ArrayList<>();
    Collections.sort(d);
    do {
      result.add(new ArrayList<>(d));
    } while (nextPerm(d));
    return result;
  }

  /**
   * Creates a new {@code ArrayList} instance, containing integer sequence
   * between form and to. Sequence can be negative.
   *
   * @param from Integer with what sequence starts.
   * @param to   Integer with what sequence ends.
   * @return List of mutable integer sequence. {@code if (from == to)}, then
   * empty ArrayList is returned.
   */
  public static ArrayList<Integer> mRange(int from, int to) {
    if (from == to)
      return new ArrayList<>(0);
    if (from < to) {
      ArrayList<Integer> result = new ArrayList<>(//
          Math.abs(from - to) + 1);
      for (int i = from; i <= to; i++)
        result.add(i);
      return result;
    }
    ArrayList<Integer> result = new ArrayList<>(
        Math.abs(from - to) + 1);
    for (int i = from; i >= to; i--)
      result.add(i);
    return result;
  }

}
