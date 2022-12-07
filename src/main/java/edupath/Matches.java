package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 25/04/2022 - 12:32 AM
 */
public class Matches {

    public static void main(String args[]) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }

    public static int matches(int[] a, int[] p) {
        if (a == null || a.length == 0) return 1;
        int sumP = 0;
        for (int i = 0; i < p.length; i++) {
            sumP += Math.abs(p[i]);
        }
        if (sumP != a.length) return 0;

        int k = 0;
        for (int i = 0; i < p.length; i++) {
            int l = k;
            for (int j = l; j < l + Math.abs(p[i]); j++) {
                if (a[k++] * p[i] < 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
