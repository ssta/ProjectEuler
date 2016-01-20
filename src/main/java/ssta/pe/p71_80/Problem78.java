package ssta.pe.p71_80;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ssta on 16/01/16.
 */
public class Problem78 {
    // for memoisation of the partitions
    private static final Map<String, BigInteger> cache = new HashMap<>();
    private static final BigInteger MILL = BigInteger.valueOf(1000000);

    public static void main(String[] args) {
        for (int i = 1; i < 5000; i++) {
            if (p(i).mod(MILL).equals(BigInteger.ZERO)) {
                System.out.println(i);
                break;
            }
            System.out.println("not "+i);
        }
    }

    public String solve(long n) {
        return p(n, n).toString();
    }

    public String solve() {
        return null;
    }

    public static BigInteger p(final long n, final long m) {
        if (n <= 1) {
            // recursive stopping condition
            return BigInteger.ONE;
        }

        if (m > n) {
            // using component numbers > n doesn't contribute any more
            // ways to sum to n
            return p(n, n);
        }

        String cacheKey = n + "," + m;
        BigInteger sum = cache.get(cacheKey);
        if (sum != null) {
            return sum;
        }

        sum = BigInteger.ZERO;
        for (long k = 1; k <= m; k++) {
            sum = sum.add(p(n - k, k));
        }

        cache.put(cacheKey, sum);
        return sum;
    }

    /**
     * Counts the number of ways of representing n as a distinct
     * sum of positive integers.
     *
     * @param n number to sum to
     * @return number of ways
     */
    public static BigInteger p(final long n) {
        return p(n, n);
    }


    private BigInteger px(long m, long n) {
        // recursive mechanism to compute the number of distinct sums of integers <=m which total n
        if (n <= 1) {
            // base case
            return BigInteger.ONE;
        }

        if (m > n) {
            // no more chopping to do
            return px(n, n);
        }

        // see if the answer is already cached...
        String key = n + "," + m;
        BigInteger sum = cache.get(key);
        if (sum != null) {
            return sum;
        }

        sum = BigInteger.ZERO;
        for (long k = 1; k <= m; k++) {
            sum = sum.add(px(n - k, k));
        }

        cache.put(key, sum);
        return sum;
    }
}
