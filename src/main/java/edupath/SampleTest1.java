package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 23/04/2022 - 11:33 AM
 */
public class SampleTest1 {
    public static void main(String args[]) {
       /* System.out.println(f(1234));
        System.out.println(f(12005));
        System.out.println(f(1));
        System.out.println(f(1000));
        System.out.println(f(0));
        System.out.println(f(-12345));*/
        /*printArrays(f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}));
        printArrays(f(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1}));
        printArrays(f(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}));*/
        /*printArrays(f(new int[]{1, 2}, new int[]{3, 4}));
        printArrays(f(new int[]{}, new int[]{1, 2, 3}));
        printArrays(f(new int[]{1, 2}, null));
        printArrays(f(null, new int[]{}));
        printArrays(f(null, null));*/
        System.out.println(f(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(f(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(f(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(f(new int[]{1, 2, 3}));
        System.out.println(f(new int[]{3, 4, 5, 10}));
        System.out.println(f(new int[]{1, 2, 10, 3, 4}));

    }

    public static int f(int[] a) {
        if (null == a || a.length < 3) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int sumLeft = 0;
        int sumRight = sum - a[0];
        for (int i = 1; i < a.length; i++) {
            sumLeft += a[i - 1];
            sumRight = sumRight - a[i];
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }

    public static void printArrays(int[] a) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    public static int[] f(int[] first, int[] second) {
        if (null == first || null == second) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return null;
        }
        int length = first.length <= second.length ? first.length : second.length;
        int[] result = new int[length];
        int k = 0;


        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    result[k++] = first[i];
                    break;
                }
            }
        }

        int[] finalResult = new int[k];
        for (int i = 0; i < k; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static int f(int n) {
        int result = 0;
        while (n / 10 != 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        if (n / 10 == 0) {
            result = result * 10 + n % 10;
        }
        return result;
    }

}
