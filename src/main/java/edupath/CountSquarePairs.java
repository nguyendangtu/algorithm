package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 21/04/2022 - 12:39 AM
 */
public class CountSquarePairs {

    public static void main(String args[]) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }

    public static int countSquarePairs(int a[]) {
        if (a.length == 1) {
            return isPerfectSquare(a[0]) == true ? 1 : 0;
        }
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > 0 && isPerfectSquare(a[i] + a[j])) {
                        count++;
                    }
                }
            }

        }
        return count;
    }

    public static boolean isPerfectSquare(int n) {
        double k = Math.sqrt(n);
        return k * k == n;
    }
}
