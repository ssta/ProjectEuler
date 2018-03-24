package ssta.pe.p001_010;

import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem3Test extends TestCase {

  public void testSolve() {
    String result = new Problem3().solve();
    assertEquals("6857", result);
  }
}