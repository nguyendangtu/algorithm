package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 11:33 PM
 */
public class isNPrimeable {

    public static void main(String args[]) {
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[]{}, 2));

    }

    public static int isNPrimeable(int[] a, int n) {
        if (a == null || a.length == 0) return 1;
        for (int i = 0; i < a.length; i++) {
            if (!isPrime(a[i] + n)) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
