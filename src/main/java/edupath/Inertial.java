package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 20/04/2022 - 11:52 PM
 */
public class Inertial {

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }

    public static int isInertial(int[] a) {
        int max = findMax(a);
        if (isContainOddValue(a) && max % 2 == 0) {
            int minOdd = findMinOdd(a);
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0 && a[i] != max && a[i] > minOdd) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean isContainOddValue(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static int findMax(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int findMinOdd(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }


}
