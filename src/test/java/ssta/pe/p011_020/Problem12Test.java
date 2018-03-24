package ssta.pe.p011_020;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem12Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem12().solve();
    assertEquals("76576500", result);
  }
}