package ssta.pe.p31_40;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem40Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem40().solve();
    assertEquals("210", result);
  }
}