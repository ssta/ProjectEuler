package ssta.pe.p31_40;

import ssta.pe.p031_040.Problem35;
import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem35Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem35().solve();
    assertEquals("55", result);
  }
}