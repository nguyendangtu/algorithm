package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 5:16 PM
 */
public class isRailroadTie {

    public static void main(String args[]) {
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }

    public static int isRailroadTie(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }
        if (a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }
        if (a.length == 2) return 1;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == 0 && (a[i - 1] == 0 || a[i + 1] == 0)) {
                return 0;
            }
            if (a[i] != 0 && (a[i - 1] != 0 && a[i + 1] != 0)) {
                return 0;
            }
        }
        return 1;
    }
}
