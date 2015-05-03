package ssta.pe.p1_10;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem1Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem1Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem1().solve();
    assertEquals("233168", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}