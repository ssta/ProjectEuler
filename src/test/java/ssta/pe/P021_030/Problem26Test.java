package ssta.pe.P021_030;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem26Test extends TestCase {

  public void testSolve() {
    String result = new Problem26().solve();
    assertEquals("983", result);
  }
}