package algorithm.HackerRank;

import java.util.Arrays;

/**
 * @author : JOHNNGUYEN
 * @since : 5/17/2023, Wed
 **/
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  
        int maxLength = 1;
        int l = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                l++;
                continue;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (l > maxLength) maxLength = l;
            l = 1;
        }
        return l > maxLength ? l : maxLength;
    }
}
