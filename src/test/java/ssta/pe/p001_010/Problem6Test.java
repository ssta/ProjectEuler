package ssta.pe.p001_010;

import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem6Test extends TestCase {

  public void testSolve() {
    String result = new Problem6().solve();
    assertEquals("25164150", result);
  }
}