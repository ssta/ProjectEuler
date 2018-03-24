package ssta.pe.p011_020;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem16Test extends TestCase {

  public void testSolve() {
    String result = new Problem16().solve();
    assertEquals("1366", result);
  }
}