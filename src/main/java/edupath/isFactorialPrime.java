package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 10:49 AM
 */
public class isFactorialPrime {
    public static void main(String args[]) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }

    public static int isFactorialPrime(int n) {
        if (n < 2) return 0;

        if (isPrime(n)) {
            int factorial = 1;
            for (int i = 1; i < n; i++) {
                factorial = 1;
                if (isPrime(i)) {
                    for (int j = 1; j <= i; j++) {
                        factorial *= j;
                    }
                    if ((factorial + 1) == n) return 1;
                }
            }
            if ((factorial + 1) == n) return 1;
        }

        return 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
