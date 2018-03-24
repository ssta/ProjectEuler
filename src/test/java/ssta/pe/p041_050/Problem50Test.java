package ssta.pe.p041_050;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem50Test {
  @Test
  public void testSolve() throws Exception {
    String result = new Problem50().solve();
    assertEquals("997651", result);
  }
}