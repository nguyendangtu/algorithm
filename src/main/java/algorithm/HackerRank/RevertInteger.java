package algorithm.HackerRank;

import java.math.BigInteger;

public class RevertInteger {
    public static void main(String args[]) {
        int x = -2147483647;
        System.out.println(reverse(x));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);
    }

    public static int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
            return 0;
        }

        int sign = x > 0 ? 1 : -1;
        int num = Math.abs(x);

        BigInteger result = BigInteger.ZERO;

        while (num / 10 > 0) {
            result = BigInteger.valueOf(result.intValue() * 10 + num % 10);
            num = num / 10;
        }

        if (num > 0) {
            result = BigInteger.valueOf(result.longValue() * 10 + num % 10);
        }

        result = result.longValue() >= Integer.MIN_VALUE && result.longValue() <= Integer.MAX_VALUE ? result : BigInteger.ZERO;

        return result.intValue() * sign;
    }
}
