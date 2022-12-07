package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 2:37 PM
 */
public class SumFactor {

    public static void main(String args[]) {
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));
    }

    public static int sumFactor(int[] a) {
        if (a == null || a.length == 0) return 0;
        if (a.length == 1) return 1;

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (sum == a[i]) {
                count++;
            }
        }

        return count;
    }
}
