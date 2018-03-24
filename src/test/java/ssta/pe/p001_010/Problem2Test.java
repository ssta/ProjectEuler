package ssta.pe.p001_010;

import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem2Test extends TestCase {

  public void testSolve() {
    String result = new Problem2().solve();
    assertEquals("4613732", result);
  }
}