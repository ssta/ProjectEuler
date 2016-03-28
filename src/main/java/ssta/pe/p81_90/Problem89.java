package ssta.pe.p81_90;

import java.util.Scanner;

public class Problem89 {
  public static void main(String[] args) {
    System.out.println(new Problem89().solve());
  }

  private String solve() {
    int inputLength = 0;
    int outputLength = 0;
    // read the file into a string
    try (Scanner sc = new Scanner(this.getClass().getResourceAsStream("/p089_roman.txt"))) {
      StringBuilder sb = new StringBuilder();
      while (sc.hasNextLine()) {
        sb.append(sc.nextLine()).append("\n");
      }
      String input = sb.toString();
      // replace anything that can get shorter into a new string
      String pattern = "DCCCC|LXXXX|VIIII|CCCC|XXXX|IIII";

      // all of the patterns can be expresseed with two characters (doesn't matter what they are, just that there are two of them
      String output = input.replaceAll(pattern, "YY");

      // compare the string sizes
      inputLength = input.length();
      outputLength = output.length();
    }
    return String.valueOf(inputLength - outputLength);
  }
}

