package ssta.pe.p001_010;

import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem7Test extends TestCase {

  public void testSolve() {
    String result = new Problem7().solve();
    assertEquals("104743", result);
  }
}