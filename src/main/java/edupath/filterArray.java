package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 28/04/2022 - 8:14 AM
 */
public class filterArray {

    public static void main(String args[]) {
        printArrays(filterArray(new int[]{9, -9}, 0));
        printArrays(filterArray(new int[]{9, -9}, 1));
        printArrays(filterArray(new int[]{9, -9}, 2));
        printArrays(filterArray(new int[]{9, -9}, 3));
        printArrays(filterArray(new int[]{9, -9}, 4));
        printArrays(filterArray(new int[]{9, -9, 5}, 3));
        printArrays(filterArray(new int[]{0, 9, 12, 18, -6}, 11));
    }

    public static void printArrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }

        System.out.println("");
    }

    public static int[] filterArray(int a[], int n) {
        if (n <= 0) return new int[]{};
        int[] base2 = new int[n / 2 + 1];
        int l = 0;
        while (n > 0) {
            base2[l++] = n % 2;
            n = n / 2;
        }

        int[] result = new int[l];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (base2[i] != 0 && i < a.length) {
                result[j++] = a[i];
            }
        }

        int[] finalResult = new int[j];
        for (int i = 0; i < j; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }
}
