package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 9:11 PM
 */
public class doIntegerBasedRounding {

    public static void main(String args[]) {
        printArray(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2));
        printArray(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3));
        printArray(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3));
        printArray(doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3));
        printArray(doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4));
        printArray(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5));
        printArray(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100));

    }

    public static void printArray(int a[]) {
        if (a == null) System.out.println("null");
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static int[] doIntegerBasedRounding(int a[], int n) {
        if (n <= 0) return a;
        int[] result = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                result[k++] = a[i];
                continue;
            }

            int j = 1;
            while (true) {
                int prev = n * (j - 1);
                int next = n * j;
                if (a[i] >= prev && a[i] <= next) {
                    if (a[i] - prev < next - a[i]) {
                        result[k++] = prev;
                    } else {
                        result[k++] = next;
                    }
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
