package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 19/04/2022 - 10:45 PM
 */
public class PrimeCount {

    public static void main(String args[]) {
        System.out.println(primeCount(2, 98));
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }

    public static int primeCount(int start, int end) {
        int count = 0;


        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }
        return count;
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
