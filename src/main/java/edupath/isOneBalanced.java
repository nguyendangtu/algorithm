package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 3:58 PM
 */
public class isOneBalanced {
    public static void main(String args[]) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }

    public static int isOneBalanced(int[] a) {
        if (a == null || a.length == 0) return 1;
        int i = 0;
        int countOne = 0;
        while (i < a.length && a[i] == 1) {
            countOne++;
            i++;
        }
        if (i == a.length) return 0;

        while (i < a.length && a[i] != 1) {
            i++;
        }

        if (i < a.length - 1 && countOne > 0) {
            return 0;
        }

        while (i < a.length && a[i] == 1) {
            countOne++;
            i++;
        }

        if (i != a.length || countOne == 0) return 0;

        return 1;
    }
}
