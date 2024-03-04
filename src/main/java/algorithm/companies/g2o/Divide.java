package algorithm.companies.g2o;

/**
 * @author : JOHNNGUYEN
 * @since : 8/5/2023, Sat
 **/
public class Divide {
    public static void main(String[] args) {
        System.out.println(divide(5, 2));
        System.out.println(divide(-5, 2));
        System.out.println(divide(4, 2));
        System.out.println(divide(-4, 2));
        System.out.println(divide(4, -2));
        System.out.println(divide(4, 0));
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException(" divide by zero");
        int sign = getSign(dividend, divisor);
        if (dividend < 0) dividend = dividend * (-1);
        if (divisor < 0) divisor = divisor * (-1);
        int count = 0;
        while (dividend - divisor >= 0) {
            count++;
            dividend = dividend - divisor;
        }
        return count * sign;
    }

    public static int getSign(int dividend, int divisor) {
        if ((dividend > 0 && divisor > 0) ||
                (dividend < 0 && divisor < 0)) return 1;
        return -1;
    }
}
