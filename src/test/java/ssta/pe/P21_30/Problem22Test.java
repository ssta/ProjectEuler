package ssta.pe.P21_30;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem22Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem22().solve();
    assertEquals("871198282", result);
  }
}