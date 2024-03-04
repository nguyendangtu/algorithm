package algorithm.leetcode;

import java.util.HashSet;

/**
 * @author : JOHNNGUYEN
 * @since : 5/29/2023, Mon
 * <p>
 * Problem 1. Given an array arr of distinct integers and an integer z, determine whether arr
 * contains two distinct numbers x and y so that x+y = z. Solve the problem by implementing the
 * following Java method.
 * public static boolean sumFound(int[] arr, int z) {
 * if(arr==null || arr.length < 2) {
 * return false;
 * }
 * //implement
 * }
 * This method returns true if the input array contains two numbers whose sum is the input integer
 * z, false otherwise.
 * Examples
 * (A) If input is [1, 4, 2, 3], 5, output should be true since 2 + 3 = 5.
 * (B) If input is [3, 3, 4, 7], 6, output should be false; although 3 + 3 = 6, it is not true that 3, 3
 * are distinct.
 * (C) If input is [1], 2, output should be false; although 1 + 1 = 2, the 1s are not distinct
 **/
public class SumFoundWithHashSet {
    public static void main(String[] args) {
        System.out.println(sumFound(new int[]{1, 4, 2, 3}, 5));
        System.out.println(sumFound(new int[]{3, 3, 4, 7}, 6));
        System.out.println(sumFound(new int[]{1}, 2));
    }

    public static boolean sumFound(int[] arr, int sum) {
        if (arr == null || arr.length == 0) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(sum - arr[i]);
            }
        }
        return false;
    }
}
