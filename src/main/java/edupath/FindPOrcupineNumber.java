package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 23/04/2022 - 4:52 AM
 */
public class FindPOrcupineNumber {

    public static void main(String args[]) {
        System.out.println(findPOrcupineNumber(139));
    }

    public static int findPOrcupineNumber(int n) {
        boolean flag = false;
        int pOrcupineNumber = -1;
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if (flag && isPrimeNumber(i)) {
                if (i % 10 == 9) {
                    return pOrcupineNumber;
                } else {
                    return -1;
                }
            }
            if (i % 10 == 9 && isPrimeNumber(i)) {
                pOrcupineNumber = i;
                flag = true;
            }
        }
        return -1;
    }

    public static boolean isPrimeNumber(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
