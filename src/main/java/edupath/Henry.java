package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 6:09 PM
 */
public class Henry {

    public static void main(String args[]) {
        System.out.println(henry(1, 7));
    }

    public static int henry(int i, int j) {
        int[] perfectNumber = new int[j + 1];
        int k = 0;
        for (int n = 0; n < Integer.MAX_VALUE; n++) {
            if (findPerfectNumber(n)) {
                perfectNumber[k++] = n;
            }
            if (k == perfectNumber.length) {
                break;
            }
        }
        return perfectNumber[i] + perfectNumber[j];
    }

    public static boolean findPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
