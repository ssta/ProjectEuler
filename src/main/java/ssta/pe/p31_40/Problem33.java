package ssta.pe.p31_40;

import org.apache.commons.lang.math.Fraction;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem33 {

  /**
   * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
   * <p>
   * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
   * <p>
   * There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.
   * <p>
   * If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
   */
  public String solve() {
    // did this pencil and paper
    // there are only 4 of them: 16/64 19/95 26/65 49/98
    Fraction f = Fraction.getFraction(16, 64);
    f = f.multiplyBy(Fraction.getFraction(19, 95));
    f = f.multiplyBy(Fraction.getFraction(26, 65));
    f = f.multiplyBy(Fraction.getFraction(49, 98));
    return String.valueOf(f.getDenominator());
  }
}
