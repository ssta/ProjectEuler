package ssta.pe.p1_10;

import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem2Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem2().solve();
    assertEquals("4613732", result);
  }
}