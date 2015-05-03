package ssta.pe.p1_10;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem3Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem3Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem3().solve();
    assertEquals("6857", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}