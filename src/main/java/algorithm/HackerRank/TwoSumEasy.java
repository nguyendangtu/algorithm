package algorithm.HackerRank;

import java.util.HashMap;

/**
 * @author : JOHNNGUYEN
 * @since : 3/29/2023, Wed
 **/
public class TwoSumEasy {
    public static void main(String[] args) {
        int[] nums = new int[]{-3, 4, 3, 90};
        System.out.println(twoSum(nums, 0));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                int[] result = new int[2];
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }
}
