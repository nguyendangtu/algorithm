package algorithm.HackerRank;

import java.util.HashMap;

/***
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class ArrayMissing {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 5, 4, 3, 6, 7, 15, 9, 10, 11, 0, 0, 0, 14};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(i) == null) {
                System.out.println(i);
            }
        }
    }


}
