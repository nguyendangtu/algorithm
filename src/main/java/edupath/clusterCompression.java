package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 4:53 PM
 */
public class clusterCompression {

    public static void main(String args[]) {
        printArrays(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4}));
        printArrays(clusterCompression(new int[]{2, 4}));
        printArrays(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0}));
        printArrays(clusterCompression(new int[]{18}));
        printArrays(clusterCompression(new int[]{-5, -5, -5, -5, -5}));
        printArrays(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1}));
        printArrays(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2}));
    }

    public static void printArrays(int[] a) {
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static int[] clusterCompression(int[] a) {
        if (a == null || a.length == 0) return null;
        int[] result = new int[a.length];
        result[0] = a[0];
        int j = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                result[j++] = a[i + 1];
            }
        }
        int[] finalResult = new int[j];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
}
