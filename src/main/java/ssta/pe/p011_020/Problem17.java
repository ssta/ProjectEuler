package ssta.pe.p011_020;

/**
 * Created by ssta on 03/05/15.
 */
class Problem17 {


  /**
   * If the numbers 1 to 5 are written out in words: one, two, three, four,
   * five,
   * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
   * <p>
   * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
   * in words, how many letters would be used?
   * <p>
   * <p>
   * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
   * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
   * 20 letters. The use of "and" when writing out numbers is in compliance with
   * British usage.
   */
  public String solve() {
    // more a case of using the computer to do it as a pen+paper exercise...
    // I *could* write a fancy-schmancy "numbers to words" doohickey, but
    // this works fine and life's too fucking short!
    //
    // I actually stole this code from the PE forum (it's not that
    // interesting a problem unless I wanted to write the 'numbers->English'
    // carbuncle.  This is the method I used to do it the first time anyways
    int onetonine = "onetwothreefourfivesixseveneightnine".length();
    int tentonineteen = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length();
    int and = "and".length();
    int twentytoninety = "twentythirtyfortyfiftysixtyseventyeightyninety".length();
    int hundred = "hundred".length();
    int thousand = "thousand".length();

    int count = "one".length() + thousand +
        900 * hundred + 100 * onetonine +
        100 * twentytoninety + 891 * and +
        80 * onetonine + 10 * (onetonine + tentonineteen);

    return String.valueOf(count);
  }
}
