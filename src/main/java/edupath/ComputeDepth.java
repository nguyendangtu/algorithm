package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 11:43 PM
 */
public class ComputeDepth {
    public static void main(String args[]) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }

    public static int computeDepth(int n) {
        int[] counts = new int[10];
        int i = 0;
        while (!isFullDigit(counts)) {
            int m = n * ++i;
            while (m > 0) {
                counts[m % 10]++;
                m = m / 10;
            }
        }
        return i;
    }

    public static boolean isFullDigit(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1) {
                return false;
            }
        }
        return true;
    }
}
