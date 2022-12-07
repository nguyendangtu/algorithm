package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 6:40 PM
 */
public class IsDivisible {

    public static void main(String args[]) {
        System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{4}, 2));
        System.out.println(isDivisible(new int[]{3, 4, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{6, 12, 24, 36}, 12));
        System.out.println(isDivisible(new int[]{}, 5));

    }

    public static int isDivisible(int[] a, int divisor) {
        if (a == null || a.length == 1) return 1;
        if (divisor == 0) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }
}
