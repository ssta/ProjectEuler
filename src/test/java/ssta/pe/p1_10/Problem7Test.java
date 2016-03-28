package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem7;
import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem7Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem7().solve();
    assertEquals("104743", result);
  }
}