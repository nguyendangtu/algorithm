package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 8:19 AM
 */
public class isSequencedArray {

    public static void main(String args[]) {
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }

    public static int isSequencedArray(int[] a, int m, int n) {
        if (a == null || a.length == 0) return 1;
        if (a[0] != m || a[a.length - 1] != n) return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < m || a[i] > n || a[i] > a[i + 1]) {
                return 0;
            }

            if (a[i] < a[i + 1] && a[i] + 1 != a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
