package ssta.pe.p001_010;

import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem5Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem5().solve();
    assertEquals("232792560", result);
  }
}