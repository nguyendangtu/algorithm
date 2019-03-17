package algorithm.HackerRank;

public class MaxDistanceOfTwoSubArrays {
    public static void main(String args[]) {
        int[] A = {-9, 1, 3, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int maxLeft = A[0];
        int maxRight = max(A, 1, A.length - 1);
        int dif = Math.abs(maxLeft - maxRight);
        int maxRightTemp = maxRight;
        for (int i = 1; i < A.length - 1; i++) {
            maxRightTemp = maxRightTemp == A[i] ? max(A, i + 1, A.length - 1) : maxRightTemp;
            maxLeft = maxLeft < A[i] ? A[i] : maxLeft;
            maxRight = maxRight > A[i] ? maxRight : maxRightTemp;
            int temp = Math.abs(maxLeft - maxRight);
            if (temp > dif) {
                dif = temp;
            }
        }

        return dif;
    }

    private static int max(int[] A, int start, int end) {
        int max = A[start];
        for (int i = start + 1; i <= end; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        return max;
    }
}
