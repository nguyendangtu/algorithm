package algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Pairs with Specific Difference
 * Given an array arr of distinct integers and a nonnegative integer k,
 * write a function findPairsWithGivenDifference that returns an array of
 * all pairs [x,y] in arr, such that x - y = k. If no such pairs exist, return an empty array.
 * <p>
 * Note: the order of the pairs in the output array should maintain the order of the y element in the original array.
 * <p>
 * Examples:
 * <p>
 * input:  arr = [0, -1, -2, 2, 1], k = 1
 * output: [[1, 0], [0, -1], [-1, -2], [2, 1]]
 * <p>
 * input:  arr = [1, 7, 5, 3, 32, 17, 12], k = 17
 * output: []
 * Constraints:
 * <p>
 * [time limit] 5000ms
 * <p>
 * [input] array.integer arr
 * <p>
 * 0 ? arr.length ? 100
 * [input]integer k
 * <p>
 * k ? 0
 * [output] array.array.integer
 *
 * @author : JOHNNGUYEN
 * @since : 8/13/2023, Sun
 **/
public class FindPairsWithGivenDifference {
    public static void main(String[] args) {
        int[][] result = findPairsWithGivenDifference(new int[]{0, -1, -2, 2, 1}, 1);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[j].length; j++) {
                System.out.print("[ ");
                System.out.print(result[i][j]);
                System.out.print(" ]");
            }
            System.out.println(" ");

        }
    }

    public static int[][] findPairsWithGivenDifference(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int[] pair = new int[2];
            if (set.contains(arr[i] + k)) {
                pair[0] = arr[i] + k;
                pair[1] = arr[i];
                list.add(pair);
            }
        }

        int arr1[][] = new int[list.size()][];
        return list.toArray(arr1);
    }
}
