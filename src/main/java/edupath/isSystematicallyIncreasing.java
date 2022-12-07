package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 9:37 AM
 */
public class isSystematicallyIncreasing {

    public static void main(String args[]) {
        //System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }

    public static int isSystematicallyIncreasing(int[] a) {
        if (a == null || a.length == 0) return 0;
        int index = 0;
        int subLen = 0;
        while (index < a.length) {
            for (int i = 0; i <= subLen; i++) {
                if (a[index] != i + 1) {
                    return 0;
                }
                index++;
            }
            subLen++;
        }
        return 1;
    }
}
