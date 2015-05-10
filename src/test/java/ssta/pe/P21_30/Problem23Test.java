package ssta.pe.P21_30;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem23Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem23().solve();
    assertEquals("4179871", result);
  }
}