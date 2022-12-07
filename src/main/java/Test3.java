/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 03/05/2022 - 5:13 AM
 */
public class Test3 {

    public static void main(String args[]) {
        /* System.out.println(isTwinPaired(new int[]{2, 4, 32}));
        System.out.println(isTwinPaired(new int[]{2, 2, 2, 1, 1, 1}));
        System.out.println(isTwinPaired(new int[]{1, 19, 23}));
        System.out.println(isTwinPaired(new int[]{1, 2}));
        System.out.println(isTwinPaired(new int[]{2, 1}));
        System.out.println(isTwinPaired(new int[]{8}));
        System.out.println(isTwinPaired(new int[]{17}));
        System.out.println(isTwinPaired(new int[]{}));*/
        System.out.println(isTwinPaired(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE,1}));
    }

    public static int isTwinPaired(int[] a) {
        if (a == null || a.length == 0) {
            return 1;
        }

        int minEven = Integer.MIN_VALUE;
        int minOdd = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] >= minEven) {
                    minEven = a[i];
                } else {
                    return 0;
                }
            } else {
                if (a[i] >= minOdd) {
                    minOdd = a[i];
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }


}
