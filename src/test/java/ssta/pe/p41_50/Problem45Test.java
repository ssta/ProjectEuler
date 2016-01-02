package ssta.pe.p41_50;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem45Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem45().solve();
    assertEquals("1533776805", result);
  }
}