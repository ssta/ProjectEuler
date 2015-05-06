package ssta.pe.p11_20;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem12Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem12Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem12().solve();
    assertEquals("76576500", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}