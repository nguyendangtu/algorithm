package algorithm.HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String args[]) {
        int[] nums = new int[]{2, 7, 11, 15, 1, 8, 8, 1, 5, 5};
        int[] result = twoSum(nums, 10);
        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) != null && !set.contains(nums[i])) {
                result.add(i);
                result.add(hashMap.get(nums[i]));
                set.add(nums[i]);
            } else {
                hashMap.put(target - nums[i], i);
            }
        }
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
