package algorithm.companies.resolvtech;

/**
 * @author : JOHNNGUYEN
 * @since : 1/8/2024, Mon
 **/
public class Test1 {
    public static int maxSubarraySum(int[] A, int[] B) {
        boolean allZeros = true;

        for (int value : B) {
            if (value != 0) {
                allZeros = false;
                break;
            }
        }

        if (allZeros) {
            return 404;
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                currentSum = Math.max(A[i], currentSum + A[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example arrays A and B
        int[] arrayA = {8, 4, 2, 2};
        int[] arrayB = {1, 0, 0, 0};

        int result = maxSubarraySum(arrayA, arrayB);
        System.out.println("Maximum sum of subarray considering B: " + result);

        // Test case where B contains only zeros
        int[] arrayC = {1, -2, 3, 4, -1, 2, 1};
        int[] arrayD = {0, 0, 0, 0, 0, 0, 0};

        int resultZeroB = maxSubarraySum(arrayC, arrayD);
        System.out.println("Maximum sum of subarray considering B with all zeros: " + resultZeroB);
    }
}
