package ssta.pe.p011_020;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem14Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem14().solve();
    assertEquals("837799", result);
  }
}