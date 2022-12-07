package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 7:24 AM
 */
public class pairwiseSum {

    public static void main(String args[]) {
        printArrays(pairwiseSum(new int[]{2, 1, 18, -5}));
        printArrays(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1}));
        printArrays(pairwiseSum(new int[]{2, 1, 18}));
        printArrays(pairwiseSum(new int[]{}));

    }

    public static int[] pairwiseSum(int a[]) {
        if (a == null || a.length == 0 || a.length % 2 == 1) {
            return null;
        }
        int[] sums = new int[a.length / 2];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sums[j++] = a[i] + a[i + 1];
            i++;
        }
        return sums;
    }

    public static void printArrays(int[] a) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        if (a.length == 0) {
            System.out.println("{}");
            return;
        }
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
