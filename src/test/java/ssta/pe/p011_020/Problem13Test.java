package ssta.pe.p011_020;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem13Test extends TestCase {

  public void testSolve() {
    String result = new Problem13().solve();
    assertEquals("5537376230", result);
  }
}