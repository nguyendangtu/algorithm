package algorithm.companies.walmart;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * <p>
 * Input: nums = [], target = 7
 * Output: 0
 *
 * @author : JOHNNGUYEN
 * @since : 8/14/2023, Mon
 **/
public class FindIndexing {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{1, 3, 5, 6}, 5));
        System.out.println(findIndex(new int[]{1, 3, 5, 6}, 2));
        System.out.println(findIndex(new int[]{1, 3, 5, 6}, 7));
        System.out.println(findIndex(new int[]{}, 7));
    }

    public static int findIndex(int[] arr, int target) {
        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] >= target) {
                return i + 1;
            }
        }

        return arr.length;
    }
}
