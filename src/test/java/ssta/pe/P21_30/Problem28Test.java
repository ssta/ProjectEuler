package ssta.pe.P21_30;

import ssta.pe.P021_030.Problem28;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem28Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem28().solve();
    assertEquals("669171001", result);
  }
}