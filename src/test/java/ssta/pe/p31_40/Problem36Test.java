package ssta.pe.p31_40;

import ssta.pe.p031_040.Problem36;
import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem36Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem36().solve();
    assertEquals("872187", result);
  }
}