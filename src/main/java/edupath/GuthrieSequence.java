package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 12:05 AM
 */
public class GuthrieSequence {

    public static void main(String args[]) {
        /*System.out.println(isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));*/
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));

    }

    public static int guthrieIndex(int n) {
        int count = 0;
        while (n != 1) {
            count++;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        return count;
    }

    public static int isGuthrieSequence(int[] a) {
        boolean flag = true;
        if (a.length < 2 || a[a.length - 1] != 1) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != a[i] / 2) {
                    return 0;
                }
            } else if (a[i + 1] != ((a[i] * 3) + 1)) {
                return 0;
            }
        }
        return 1;
    }
}
