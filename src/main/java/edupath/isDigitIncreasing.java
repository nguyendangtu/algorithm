package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 11:52 PM
 */
public class isDigitIncreasing {
    public static void main(String args[]) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    public static int isDigitIncreasing(int n) {
        if (n < 0) {
            return 0;
        }
        int count = 0;
        int m = n;
        while (m > 0) {
            count++;
            m = m / 10;
        }

        for (int i = 1; i <= 9; i++) {
            int tmp = 0;
            int sum = 0;
            int num = 0;
            if ((i * count) % 10 == n % 10) {
                while (tmp < count) {
                    num = num * 10 + i;
                    sum += num;
                    tmp++;
                }
                if (sum == n) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
