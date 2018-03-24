package ssta.pe.p041_050;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem41Test extends TestCase {

  public void testSolve() {
    String result = new Problem41().solve();
    assertEquals("7652413", result);
  }
}