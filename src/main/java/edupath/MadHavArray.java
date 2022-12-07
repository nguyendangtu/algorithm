package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 20/04/2022 - 12:30 AM
 */
public class MadHavArray {

    public static void main(String args[]) {
        System.out.println(isMadHavArray(new int[]{2, 1, 1}));
        System.out.println(isMadHavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadHavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadHavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadHavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadHavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadHavArray(new int[]{3, 1, 2, 3, 0}));

    }

    public static int isMadHavArray(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        int i, j, k, pos, init = a[0];
        for (i = 2; ; i++) {
            int sum = i * (i + 1) / 2;
            if (sum == a.length) break;
            if (sum > a.length) return 0;
        }

        pos = i;
        for (i = 1, k = 1; i < pos; i++) {
            int sum = 0;
            for (j = 0; j <= i; j++) {
                sum += a[k++];
            }
            if (sum != init) return 0;
        }

        return 1;
    }

    public static int isMadHavArray1(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int l = 0;
        int j = 0;
        for (int i = 0; j <= a.length - 1; i = i + l) {
            l++;
            if (j + l >= a.length) {
                return 0;
            }
            int sum = 0;
            for (j = i + l; j <= i + l + l; j++) {
                sum += a[j];
            }
            if (a[0] != sum) {
                return 0;
            }

        }
        return 1;
    }
}
