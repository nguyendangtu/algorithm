package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 8:57 AM
 */
public class largestPrimeFactor {
    public static void main(String args[]) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) return 0;
        int max = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                if (isPrimeFactor(i)) {
                    max = i;
                }
            }
        }
        return max;
    }

    public static boolean isPrimeFactor(int n) {
        for (int i = 2; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
