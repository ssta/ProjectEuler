package ssta.pe.p1_10;

import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem7Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem7().solve();
    assertEquals("104743", result);
  }
}