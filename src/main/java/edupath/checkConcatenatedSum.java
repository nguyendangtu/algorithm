package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 28/04/2022 - 11:05 PM
 */
public class checkConcatenatedSum {

    public static void main(String args[]) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        if (catlen < 1) return 0;
        int m = n;
        int[] digits = new int[65];
        int k = 0;
        while (m > 0) {
            digits[k++] = m % 10;
            m = m / 10;
        }
        int[] numbers = new int[k];
        int l = 0;
        for (int i = k - 1; i >= 0; i--) {
            int len = 0;
            int num = 0;
            int p = 1;
            while (len < catlen) {
                num = digits[i] * p + num;
                p = p * 10;
                len++;
            }
            numbers[l++] = num;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        if (sum == n) return 1;
        return 0;
    }

}
