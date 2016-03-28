package ssta.pe.P21_30;

import ssta.pe.P021_030.Problem30;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem30Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem30().solve();
    assertEquals("443839", result);
  }
}