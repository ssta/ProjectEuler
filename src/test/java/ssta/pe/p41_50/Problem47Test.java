package ssta.pe.p41_50;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem47Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem47().solve();
    assertEquals("134043", result);
  }
}