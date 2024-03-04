package algorithm.leetcode;

/**
 * @author : JOHNNGUYEN
 * @since : 8/6/2023, Sun
 **/
public class SecondSmallest {
    public static void main(String[] args) throws Exception {
        System.out.println(secondSmallest(new int[]{1, 4, 0, 2, 3}));
        System.out.println(secondSmallest(new int[]{3, 3, 0, 4, 7}));
        System.out.println(secondSmallest(new int[]{9}));
    }

    public static int secondSmallest(int[] arr) throws Exception {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        int secondMin = min;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }

        arr[index] = arr[0];
        arr[0] = min;

        for (int i = 1; i < arr.length; i++) {
            if (secondMin > arr[i]) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }
}
