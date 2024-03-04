package algorithm.HackerRank;

/**
 * @author : JOHNNGUYEN
 * @since : 5/16/2023, Tue
 **/
public class MaxArea {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (r > l) {
            int tmp = (r - l) * Math.min(height[l], height[r]);
            if (tmp > max) {
                max = tmp;
            }
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return max;

    }

}
