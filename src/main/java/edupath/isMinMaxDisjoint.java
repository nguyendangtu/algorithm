package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 3:16 PM
 */
public class isMinMaxDisjoint {

    public static void main(String args[]) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a == null || a.length == 0) return 0;
        int min = a[0], max = a[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == max || a[i] == min) {
                return 0;
            }
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }

        if (max == min || Math.abs(maxIndex - minIndex) == 1) {
            return 0;
        }

        return 1;
    }
}
