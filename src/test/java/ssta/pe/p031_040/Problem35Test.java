package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem35Test extends TestCase {

  public void testSolve() {
    String result = new Problem35().solve();
    assertEquals("55", result);
  }
}