package ssta.pe.p41_50;

import ssta.pe.p041_050.Problem43;
import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem43Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem43().solve();
    assertEquals("16695334890", result);
  }
}