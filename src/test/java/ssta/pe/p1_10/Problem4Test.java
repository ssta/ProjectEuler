package ssta.pe.p1_10;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem4Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem4Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem4().solve();
    assertEquals("906609", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}