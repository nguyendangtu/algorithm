package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 3:28 PM
 */
public class isConsecutiveFactored {

    public static void main(String args[]) {
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));

    }

    public static int isConsecutiveFactored(int n) {
        if (n <= 0) return 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }
        return 0;
    }
}
