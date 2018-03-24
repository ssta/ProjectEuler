package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem38Test extends TestCase {

  public void testSolve() {
    String result = new Problem38().solve();
    assertEquals("932718654", result);
  }
}