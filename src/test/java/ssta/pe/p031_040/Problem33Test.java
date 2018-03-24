package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem33Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem33().solve();
    assertEquals("100", result);
  }
}