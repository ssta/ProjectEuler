package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem6;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem6Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem6().solve();
    assertEquals("25164150", result);
  }
}