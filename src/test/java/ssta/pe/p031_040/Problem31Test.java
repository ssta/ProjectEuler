package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem31Test extends TestCase {

  public void testSolve() {
    String result = new Problem31().solve();
    assertEquals("73682", result);
  }
}