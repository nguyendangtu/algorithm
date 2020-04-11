package algorithm.HackerRank;

public class TheMostWater {
    public static void main(String args[]) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("The most water is " + maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l <= r) {
            area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return area;
    }
}
