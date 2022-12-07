package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 11:49 PM
 */
public class Array121 {
    public static void main(String args[]) {
        System.out.println(array121(new int[]{1, 2, 1}));
        System.out.println(array121(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(array121(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(array121(new int[]{1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(array121(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(array121(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(array121(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(array121(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println(array121(new int[]{2, 2, 2}));
    }

    public static int array121(int[] a) {
        if (a == null || a.length < 3) return 0;
        if (a[0] != 1 || a[a.length - 1] != 1) return 0;

        int countOne = 0;
        int countTwo = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] != 1 && a[i] != 2) {
                return 0;
            }

            int tmpCountOne = 0;
            int tmpCountTwo = 0;
            while (i < a.length && a[i] == 1) {
                tmpCountOne++;
                i++;
            }
            while (i < a.length && a[i] == 2) {
                tmpCountTwo++;
                i++;
            }

            if (countOne == 0) {
                countOne = tmpCountOne;
            } else if (tmpCountOne > 0 && countOne != tmpCountOne) {
                return 0;
            }

            if (countTwo == 0) {
                countTwo = tmpCountTwo;
            } else if (tmpCountTwo > 0 && countTwo != tmpCountTwo) {
                return 0;
            }
        }
        if (countTwo == 0) return 0;
        return 1;
    }
}
