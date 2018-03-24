package ssta.pe.p031_040;

/**
 * Created by ssta on 03/05/15.
 */
class Problem31 {

  /**
   * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
   * <p>
   * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
   * It is possible to make £2 in the following way:
   * <p>
   * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
   * How many different ways can £2 be made using any number of coins?
   */
  public String solve() {
    int count = 0;
    int a, b, c, d, e, f, g; /*respectively £2, £1, 50p, 20p, 10p, 5p, 2p and
     1p coins*/
    for (a = 200; a >= 0; a -= 200)
      for (b = a; b >= 0; b -= 100)
        for (c = b; c >= 0; c -= 50)
          for (d = c; d >= 0; d -= 20)
            for (e = d; e >= 0; e -= 10)
              for (f = e; f >= 0; f -= 5)
                for (g = f; g >= 0; g -= 2)
                  count++;
    return String.valueOf(count);
  }
}
