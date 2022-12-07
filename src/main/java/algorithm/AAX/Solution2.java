package algorithm.AAX;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/09/2022 - 10:37 PM
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(solution(1, 1000000000));
    }

    public static int solution(int A, int B) {
        int count = 0;
        int i = 0;
        int tmp = 1;
        do {
            tmp = i * (i + 1);
            if (tmp >= A && tmp <= B) {
                count++;
            }
            i++;
        } while (tmp <= B);

        return count;
    }

}
