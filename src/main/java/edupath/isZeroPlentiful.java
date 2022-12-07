package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 11:20 PM
 */
public class isZeroPlentiful {
    public static void main(String args[]) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));

    }

    public static int isZeroPlentiful(int[] a) {
        if (a == null || a.length < 3) return 0;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            while (i < a.length && a[i] == 0) {
                count++;
                i++;
            }
            if (count >= 4) {
                result++;
            } else if (count > 0) {
                return 0;
            }
        }
        return result;
    }
}
