package algorithm.companies.walmart;

/**
 * @author : JOHNNGUYEN
 * @since : 8/30/2023, Wed
 **/
public class TwoMedianOfSortedArray {
    public static void main(String[] args) {
        System.out.println(median(new int[]{1, 3}, new int[]{2}));
        System.out.println(median(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(median(new int[]{1}, new int[]{2}));
    }

    public static double median(int[] a1, int[] a2) {
        int[] arr = merge2Array(a1, a2);
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] * 1.0 + arr[arr.length / 2 - 1] * 1.0) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

    public static int[] merge2Array(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[a1.length + a2.length];
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        while (j < a2.length) {
            result[k++] = a2[j++];
        }
        return result;
    }


}
