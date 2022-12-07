package algorithm.AAX;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/09/2022 - 10:38 PM
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(solution(5, 8));
        System.out.println(solution(5, 9));
        System.out.println(solution(4, 10));
        System.out.println(solution(1, 2));
        System.out.println(solution(10, 5));
    }

    static int solution(int N, int K) {
        int total = 0;

        int remainingK = K;
        int curN = N;

        while (remainingK > 0 || curN == 0) {
            if (remainingK <= curN) {
                remainingK = 0;
                total++;
                break;
            } else {
                remainingK -= curN;
                curN--;
                total++;
            }
        }

        return remainingK == 0 ? total : -1;
    }
}

