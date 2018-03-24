package ssta.pe.p011_020;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem19Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem19().solve();
    assertEquals("171", result);
  }
}