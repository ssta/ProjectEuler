package ssta.pe.p071_p080;

import org.junit.Test;
import ssta.pe.p071_080.Problem77;

import static org.junit.Assert.assertEquals;

/**
 * ssta.pe.p071_p080.Problem77Test, created on 15/01/2016 13:48 <p>
 * @author StephenSt
 */
public class Problem77Test {
  @Test
  public void testSolve() {
    String result = new Problem77().solve();
    assertEquals("71", result);
  }
}