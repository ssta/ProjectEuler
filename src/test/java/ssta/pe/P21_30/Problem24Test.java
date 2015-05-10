package ssta.pe.P21_30;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem24Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem24().solve();
    assertEquals("2783915460", result);
  }
}