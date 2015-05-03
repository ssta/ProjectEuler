package ssta.pelib;

/**
 * Created by ssta on 03/05/15.
 */
public class SsString {
  public static boolean isPalindrome(String s) {
    if (s == null) {return false;}
    if (s.length() < 2) {return true;}

    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {return false;}
    }
    return true;
  }
}
