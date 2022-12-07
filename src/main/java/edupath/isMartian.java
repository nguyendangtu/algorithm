package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 9:56 PM
 */
public class isMartian {

    public static void main(String args[]) {
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }

    public static int isMartian(int[] a) {
        if (a == null || a.length == 0) return 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return 0;
            }
            if (a[i] == 1) {
                countOne++;
            } else if (a[i] == 2) {
                countTwo++;
            }
        }
        if (a[a.length - 1] == 1) {
            countOne++;
        } else if (a[a.length - 1] == 2) {
            countTwo++;
        }
        if (countOne > countTwo) return 1;
        return 0;
    }
}
