package algorithm.HackerRank;

import java.util.*;

public class TwoSum {
    public static void main(String args[]) {
        int[] nums = new int[]{2, 7, 11, 15, 1, 8, 8, 1, 5, 5};
        int[] result = twoSum(nums, 10);
        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                list.add(map.get(nums[i]));
                list.add(i);
                map.remove(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
