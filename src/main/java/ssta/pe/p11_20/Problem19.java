package ssta.pe.p11_20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem19 {
  /**
   * You are given the following information, but you may prefer to do some research for yourself.
   * <p>
   * 1 Jan 1900 was a Monday.
   * Thirty days has September,
   * April, June and November.
   * All the rest have thirty-one,
   * Saving February alone,
   * Which has twenty-eight, rain or shine.
   * And on leap years, twenty-nine.
   * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
   * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
   */
  public String solve() {
    // Java Calendar makes this relatively easy...
    int count = 0;
    Calendar cal = new GregorianCalendar();
    for (int year = 1901; year <= 2000; year++) {
      for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) { //
        // Calendar
        // uses
        // month 0 for January
        cal.set(year, month, 1);
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
          count++;
        }
      }
    }
    return String.valueOf(count);
  }
}
