package algorithm.AAX;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 4, 5}));
        System.out.println(solution(new int[]{2, 3, 4, 1, 5}));
        System.out.println(solution(new int[]{1, 3, 4, 2, 5}));
        System.out.println(solution(new int[]{2, 1, 6, 3, 7, 4, 5}));
    }

    static int solution(int[] A) {
        int count = 0;

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
            if (min == 1 && max == i + 1) {
                count++;
            }
        }

        return count;
    }
}
