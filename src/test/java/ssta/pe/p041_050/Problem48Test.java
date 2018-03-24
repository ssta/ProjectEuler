package ssta.pe.p041_050;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem48Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem48().solve();
    assertEquals("9110846700", result);
  }
}