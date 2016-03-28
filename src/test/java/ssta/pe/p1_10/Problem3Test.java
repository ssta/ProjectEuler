package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem3;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem3Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem3().solve();
    assertEquals("6857", result);
  }
}