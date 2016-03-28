package ssta.pe.p31_40;

import ssta.pe.p031_040.Problem37;
import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem37Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem37().solve();
    assertEquals("748317", result);
  }
}