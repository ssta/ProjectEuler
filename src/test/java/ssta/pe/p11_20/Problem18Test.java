package ssta.pe.p11_20;

import ssta.pe.p011_020.Problem18;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem18Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem18().solve();
    assertEquals("1074", result);
  }
}