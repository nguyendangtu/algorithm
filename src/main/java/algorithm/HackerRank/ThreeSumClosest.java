package algorithm.HackerRank;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String args[]) {
        //int[] nums = new int[]{-1, 2, 1, -4};
        //int[] nums = new int[]{0, 0, 0};
        //int[] nums = new int[]{1, 1, 1, 1};
        int[] nums = new int[]{1, 1, -1, -1, 3};
        System.out.println(threeSumClosest(nums, -1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sumClosest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - sum) < Math.abs((long)target - (long)sumClosest)) {
                    sumClosest = sum;
                }
                if (sum > target) {
                    r--;
                }else {
                    l++;
                }
            }
        }
        return sumClosest;
    }
}
