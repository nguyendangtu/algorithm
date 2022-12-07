package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 10:05 PM
 */
public class isOddHeavy {
    public static void main(String args[]) {
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }

    public static int isOddHeavy(int[] a) {
        int min = minOdd(a);
        if (min == Integer.MAX_VALUE) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > min) {
                return 0;
            }
        }
        return 1;
    }

    public static int minOdd(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
