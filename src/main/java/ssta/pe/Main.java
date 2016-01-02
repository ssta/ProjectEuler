package ssta.pe;

/**
 * Created by ssta on 06/12/15.
 */
public class Main {
  public static void main(String[] args) {
    int x = 1;
    int y = 1;
    int z = 2;
    if ((y = ++x) == z--) {
      System.out.println(z++);
    } else {
      System.out.println("fuck me!");
    }
    System.out.println(z);
    y = 1;
    x = y++ + y;
    System.out.println(x);
  }
}
