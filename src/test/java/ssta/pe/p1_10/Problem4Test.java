package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem4;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem4Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem4().solve();
    assertEquals("906609", result);
  }
}