package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 4:45 PM
 */
public class isZeroLimited {

    public static void main(String [] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));

    }

    public static int isZeroLimited(int a[]) {
        if (a == null || a.length == 0 || a.length == 1) return 1;
        int n = 0;
        int i = 0;
        while (i < a.length && 3 * n + 1 < a.length) {
            int k = 3 * n + 1;
            if (k < a.length && a[k] != 0) return 0;
            while (i < a.length && i < k) {
                if (a[i] == 0) {
                    return 0;
                }
                i++;
            }
            i++;
            n++;
        }
        return 1;
    }
}
