package algorithm.HackerRank;

public class Median {
    public static void main(String args[]) {
        Median median = new Median();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{7,9};
        System.out.println(median.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;

        if (nums1.length > nums2.length) {
            sum = sum(nums1, nums2);
        } else {
            sum = sum(nums2, nums1);
        }
        return sum / (nums1.length + nums2.length);
    }

    public double sum(int[] nums1, int[] nums2) {
        double sum = 0;
        if (nums1.length > 0) {
            for (int i = 0; i < nums1.length / 2; i++) {
                sum = sum + nums1[i] + nums1[nums1.length - 1 - i];

                if (nums2.length > 0 && i < nums2.length / 2) {
                    sum = sum + nums2[i] + nums2[nums2.length - 1 - i];
                }
            }
            if (nums1.length > 0 && nums1.length % 2 != 0) {
                sum += nums1[nums1.length / 2];
            }
            if (nums2.length > 0 && nums2.length % 2 != 0) {
                sum += nums2[nums2.length / 2];
            }
        }

        return sum;
    }
}

