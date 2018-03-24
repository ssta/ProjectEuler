package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem34Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem34().solve();
    assertEquals("40730", result);
  }
}