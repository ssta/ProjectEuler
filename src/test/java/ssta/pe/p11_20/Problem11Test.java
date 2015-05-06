package ssta.pe.p11_20;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem11Test extends TestCase {

  public void testSolve() throws Exception {
    String name = Problem11Test.class.getName();
    System.out.println(name + " starting");
    Stopwatch timer = Stopwatch.createStarted();
    String result = new Problem11().solve();
    assertEquals("70600674", result);
    timer.stop();
    System.out.println(name + " took: " + timer);
  }
}