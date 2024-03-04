package algorithm.companies.resolvtech;

import java.util.Arrays;

/**
 * @author : JOHNNGUYEN
 * @since : 8/17/2023, Thu
 **/
public class ProductivityPair {
    public static void main(String[] args) {
        productivityPairs(5, new int[]{5, 4, 3, 2, 1}, 6);
    }

    public static void productivityPairs(int N, int[] A, int K) {
        int value = -404;
        int sum = -405;

        value = 0;
        sum = 0;
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] * A[j] >= K) {
                value += (j - i);
                for (int l = i; l < j; l++) {
                    sum += A[l] * A[j];
                }
                j--;
            } else {
                i++;
            }
        }

        System.out.println(value + " " + sum);
    }

    public static void productivityPairsBruteForce(int N, int[] A, int K) {
        int value = -404;
        int sum = -405;

        value = 0;
        sum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] * A[j] >= K) {
                    value++;
                    sum += A[i] * A[j];
                }
            }
        }

        System.out.println(value + " " + sum);
    }
}
