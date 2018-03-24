package ssta.pe.p031_040;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem39Test extends TestCase {

  public void testSolve() {
    String result = new Problem39().solve();
    assertEquals("840", result);
  }
}