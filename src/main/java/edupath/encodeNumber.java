package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 9:37 AM
 */
public class encodeNumber {

    public static void main(String args[]) {
        printArrays(encodeNumber(2));
        printArrays(encodeNumber(6));
        printArrays(encodeNumber(14));
        printArrays(encodeNumber(24));
        printArrays(encodeNumber(1200));
        printArrays(encodeNumber(1));
        printArrays(encodeNumber(-18));

    }

    public static void printArrays(int[] a) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static int[] encodeNumber(int n) {
        if (n <= 2) return null;
        int[] result = new int[n / 2 + 1];
        int j = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && isPrimeNumber(i)) {
                int m = n;
                while (m % i == 0) {
                    result[j++] = i;
                    m = m / i;
                }
            }
        }
        int[] finalResult = new int[j];
        for (int i = 0; i < j; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
