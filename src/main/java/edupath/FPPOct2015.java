package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/11/2022 - 4:42 PM
 */
public class FPPOct2015 {

    public static void main(String args[]) {
        int a[] = new int[]{};
        // System.out.println(isPaired(a));
        System.out.println(maxDistance(12));
        System.out.println(maxDistance(49));
        System.out.println(maxDistance(13));
    }

    public static int isPaired(int a[]) {
        int countEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                countEven++;
            }
        }

        if (countEven % 2 == 1) {
            return 0;
        }

        return 1;
    }

    public static int maxDistance(int a) {
        if (a < 1) {
            return -1;
        }

        if (a == 1) return 0;
        int min = a, max = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                if (min >= i) {
                    min = i;
                }
                if (max <= i) {
                    max = i;
                }
            }
        }

        if (min == a) return -1;
        return max - min;
    }
}
