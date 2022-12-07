package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 4:50 PM
 */
public class isCentered15 {

    public static void main(String args[]) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15 - 1, -1}));

    }

    public static int isCentered15(int[] a) {
        if (a == null || a.length == 0) return 0;
        if (a.length == 1) {
            if (a[0] == 15) {
                return 1;
            } else {
                return 0;
            }
        }

        if (a.length == 2) {
            if (a[0] + a[1] == 15) {
                return 1;
            } else {
                return 0;
            }
        }
        int mid = a.length / 2;
        int sum = a[mid];
        if (a.length % 2 == 0) {
            mid = mid - 1;
            sum += a[mid];
        }
        if (sum == 15) {
            return 1;
        }

        for (int i = mid - 1; i >= 0; i--) {
            sum = sum + a[i] + a[a.length - 1 - i];
            if (sum == 15) return 1;
        }

        return 0;
    }
}
