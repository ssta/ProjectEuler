package ssta.pe.p041_050;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem46Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem46().solve();
    assertEquals("5777", result);
  }
}