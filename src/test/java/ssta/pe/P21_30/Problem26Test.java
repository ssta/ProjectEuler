package ssta.pe.P21_30;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem26Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem26().solve();
    assertEquals("983", result);
  }
}