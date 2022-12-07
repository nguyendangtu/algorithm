package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 10:10 PM
 */
public class isPairedN {

    public static void main(String args[]) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[]{3}, 3));
        System.out.println(isPairedN(new int[]{}, 0));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 15));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 16));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 14));
    }

    public static int isPairedN(int[] a, int n) {
        if (a == null || a.length < 2) return 0;
        if (n < 1 || n > (a.length - 1) * 2 - 1) return 0;
        int start = 0;
        if (n >= a.length) start = n + 1 - a.length;
        for (int i = start; i <= n / 2; i++) {
            if (a[i] + a[n - i] == n) {
                return 1;
            }
        }
        return 0;
    }
}
