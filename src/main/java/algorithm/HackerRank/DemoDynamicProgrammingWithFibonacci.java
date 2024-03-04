package algorithm.HackerRank;

import java.util.Arrays;
import java.util.Hashtable;

/***
 * This class will demo dynamic programming via Fibonacci
 * 1. Recursive
 * 2. Memoized
 * 3. Bottom-up
 * Link reference: https://www.youtube.com/watch?v=vYquumk4nWw
 */
public class DemoDynamicProgrammingWithFibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(recursiveFib(n));

        int[] memo = new int[n + 1];
    //    Arrays.stream(memo).forEach(System.out::println);
        System.out.println(memoizedFib(n, memo));
        System.out.println(bottomUpFib(n));
        Hashtable a = new Hashtable<>();
    }

    public static int recursiveFib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    public static int memoizedFib(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }

        int result;
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = memoizedFib(n - 1, memo) + memoizedFib(n - 2, memo);
        }

        memo[n] = result;

        return result;
    }

    public static int bottomUpFib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] bottomUp = new int[n];
        bottomUp[0] = 1;
        bottomUp[1] = 1;
        for (int i = 2; i < n; i++) {
            bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
        }
        return bottomUp[n - 1];
    }
}
