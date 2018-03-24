package ssta.pe.P021_030;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem22Test extends TestCase {

  public void testSolve() {
    String result = new Problem22().solve();
    assertEquals("871198282", result);
  }
}