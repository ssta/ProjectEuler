package ssta.pe.p041_050;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem43Test extends TestCase {

  public void testSolve() {
    String result = new Problem43().solve();
    assertEquals("16695334890", result);
  }
}