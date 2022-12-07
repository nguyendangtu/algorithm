package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 6:40 PM
 */
public class fullnessQuotient {

    public static void main(String args[]) {
        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }

    public static int fullnessQuotient(int n) {
        if (n < 1) return -1;
        int count = 0;
        for (int b = 2; b <= 9; b++) {
            int m = n;
            int i = 1;
            while (m > 0) {
                if (m % b == 0) {
                    i = 0;
                }
                m = m / b;
            }
            count += i;
        }
        return count;
    }
}
