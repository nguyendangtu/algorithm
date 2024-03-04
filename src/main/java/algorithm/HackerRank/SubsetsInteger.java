package algorithm.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class SubsetsInteger {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> output = subsets(nums);
        System.out.println(output);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        backTrack(result, tmpList, nums, 0);
        return result;
    }

    public static void backTrack(List<List<Integer>> result, List<Integer> tmpList, int[] nums, int start) {
        result.add(new ArrayList<>(tmpList));
        for (int i = start; i < nums.length; i++) {
            tmpList.add(nums[i]);
            backTrack(result, tmpList, nums, ++start);
            tmpList.remove(tmpList.size() - 1);
        }
    }

}
