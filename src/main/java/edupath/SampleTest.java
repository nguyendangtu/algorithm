package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * https://compro.mum.edu/apply/
 * Your ID-Number is 400359.
 * Username: nguyendangtu1987@gmail.com
 * Password: bxa822
 * @Created 23/04/2022 - 6:27 AM
 */
public class SampleTest {
    public static void main(String args[]) {
      /*  System.out.println(isExistMiddleNumber(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isExistMiddleNumber(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isExistMiddleNumber(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isExistMiddleNumber(new int[]{1, 2, 3, 4}));
        System.out.println(isExistMiddleNumber(new int[]{}));
        System.out.println(isExistMiddleNumber(new int[]{10}));*/


        /*System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1, 2}));
        System.out.println(f(new int[]{1, 2, 3}));
        System.out.println(f(new int[]{1, 2, 3, 4}));
        System.out.println(f(new int[]{3, 3, 4, 4}));
        System.out.println(f(new int[]{3, 2, 3, 4}));
        System.out.println(f(new int[]{4, 1, 2, 3}));
        System.out.println(f(new int[]{1, 1}));
        System.out.println(f(new int[]{}));*/

        printChars(f(new char[]{'a', 'b', 'c'}, 0, 4));
        printChars(f(new char[]{'a', 'b', 'c'}, 0, 3));
        printChars(f(new char[]{'a', 'b', 'c'}, 0, 2));
        printChars(f(new char[]{'a', 'b', 'c'}, 0, 1));
        printChars(f(new char[]{'a', 'b', 'c'}, 1, 3));
        printChars(f(new char[]{'a', 'b', 'c'}, 1, 2));
        printChars(f(new char[]{'a', 'b', 'c'}, 1, 1));
        printChars(f(new char[]{'a', 'b', 'c'}, 2, 2));
        printChars(f(new char[]{'a', 'b', 'c'}, 2, 1));
        printChars(f(new char[]{'a', 'b', 'c'}, 3, 1));
        printChars(f(new char[]{'a', 'b', 'c'}, 1, 0));
        printChars(f(new char[]{'a', 'b', 'c'}, -1, 2));
        printChars(f(new char[]{'a', 'b', 'c'}, -1, -2));
        printChars(f(new char[]{}, 0, 1));

    }

    public static void printChars(char[] a) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    public static char[] f(char[] a, int start, int len) {
        if (start < 0 || start + len > a.length) {
            return null;
        }

        char[] result = new char[len];
        int j = 0;
        for (int i = start; i < start + len; i++) {
            if (a[i] >= 65 && a[i] <= 122) {
                result[j++] = a[i];
            } else {
                return null;
            }
        }

        return result;
    }

    public static int f(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                sum += a[i];
            } else {
                sum -= a[i];
            }
        }
        return sum;
    }

    public static int isExistMiddleNumber(int[] a) {
        if (a.length == 0 || a.length % 2 == 0) {
            return 0;
        }
        if (a.length == 1) {
            return 1;
        }
        int mid = a.length / 2;
        int min = a[mid];
        for (int i = 0; i < a.length; i++) {
            if (i != mid && a[i] <= min) {
                return 0;
            }
        }
        return 1;
    }


}
