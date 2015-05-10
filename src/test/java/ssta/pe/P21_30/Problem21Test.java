package ssta.pe.P21_30;

import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem21Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem21().solve();
    assertEquals("31626", result);
  }
}