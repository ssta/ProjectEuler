package ssta.pe.p11_20;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem15Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem15().solve();
    assertEquals("137846528820", result);
  }
}