package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 3:50 PM
 */
public class RepsEqual {

    public static void main(String args[]) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }

    public static int repsEqual(int[] a, int n) {
        int i = a.length - 1;
        while (n > 0) {
            if (i < 0 || n % 10 != a[i--]) {
                return 0;
            }
            n = n / 10;
        }
        if (i > 0) {
            for (int j = 0; j <= i; j++) {
                if (a[j] != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
