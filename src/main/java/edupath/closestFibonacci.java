package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 12:35 PM
 */
public class closestFibonacci {
    public static void main(String args[]) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    public static int closestFibonacci(int n) {
        if (n < 1) return 0;
        for (int i = n - 1; i >= 1; i--) {
            int result = fibonacci(i);
            if (n >= result) {
                return result;
            }
        }
        return 0;
    }

    public static int fibonacci(int n) {
        int fn = 1;
        int fn1 = 1;
        int fn2 = 0;
        for (int i = 2; i <= n; i++) {
            fn2 = fn + fn1;
            fn = fn1;
            fn1 = fn2;
        }
        return fn2;
    }
}
