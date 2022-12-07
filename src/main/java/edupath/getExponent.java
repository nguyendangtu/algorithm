package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 10:17 PM
 */
public class getExponent {
    public static void main(String args[]) {
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }

    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1;
        }
        int m = 1;
        int x = -1;
        while (n % m == 0) {
            m = m * p;
            x++;
        }
        return x;
    }
}
