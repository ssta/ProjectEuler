package ssta.pe.p041_050;

import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem49Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem49().solve();
    assertEquals("296962999629", result);
  }
}