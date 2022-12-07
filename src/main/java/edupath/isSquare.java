package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 9:56 PM
 */
public class isSquare {
    public static void main(String args[]) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    public static int isSquare(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        for (int i = 0; i <= n / 2; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }
}
