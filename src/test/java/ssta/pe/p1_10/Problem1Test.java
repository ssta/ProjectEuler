package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem1;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem1Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem1().solve();
    assertEquals("233168", result);
  }
}