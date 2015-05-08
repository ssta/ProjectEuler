package ssta.pe.p1_10;

import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem10Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem10().solve();
    assertEquals("142913828922", result);
  }
}