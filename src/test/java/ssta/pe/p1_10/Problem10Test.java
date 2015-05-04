package ssta.pe.p1_10;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem10Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem10Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem10().solve();
    assertEquals("142913828922", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}