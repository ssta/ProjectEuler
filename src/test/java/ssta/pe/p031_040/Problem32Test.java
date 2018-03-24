package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem32Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem32().solve();
    assertEquals("45228", result);
  }
}