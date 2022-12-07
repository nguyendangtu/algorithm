package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 28/04/2022 - 10:55 PM
 */
public class largestAdjacentSum {

    public static void main(String args[]) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));

    }

    public static int largestAdjacentSum(int[] a) {
        int max = a[0] + a[1];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }
}
