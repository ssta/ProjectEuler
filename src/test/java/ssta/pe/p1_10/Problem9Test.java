package ssta.pe.p1_10;

import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem9Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem9().solve();
    assertEquals("31875000", result);
  }
}