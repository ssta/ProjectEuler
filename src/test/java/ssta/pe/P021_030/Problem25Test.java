package ssta.pe.P021_030;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem25Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem25().solve();
    assertEquals("4782", result);
  }
}