package algorithm.companies.walmart;

import java.util.Arrays;

/**
 * @author : JOHNNGUYEN
 * @since : 9/1/2023, Fri
 **/
public class RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        int[] a = removeDuplicatedFromSortedArray(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3});
        Arrays.stream(a).forEach(System.out::println);
    }

    public static int[] removeDuplicatedFromSortedArray(int[] a) {
        int jump = 0;
        for (int i = 1; i < a.length; i++) {
            while (i < a.length && a[i] == a[i - 1]) {
                i++;
                jump++;
            }

            if (i < a.length) {
                a[i - jump] = a[i];
            }
        }
        int[] result = new int[a.length - jump];
        for (int i = 0; i < a.length - jump; i++) {
            result[i] = a[i];
        }
        return result;
    }

}
