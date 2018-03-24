package ssta.pe.P021_030;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem29Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem29().solve();
    assertEquals("9183", result);
  }
}