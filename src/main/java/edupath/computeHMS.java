package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 9:38 PM
 */
public class computeHMS {
    public static void main(String[] args) {
        printArrays(computeHMS(3735));
        printArrays(computeHMS(380));
        printArrays(computeHMS(3650));
        printArrays(computeHMS(55));
        printArrays(computeHMS(0));
    }

    public static void printArrays(int a[]) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        if (a.length == 0) {
            System.out.println("{}");
            return;
        }
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static int[] computeHMS(int seconds) {
        int[] result = new int[3];
        int i = 0;
        int p = 3600;
        while (i < 3) {
            result[i] = seconds / p;
            seconds = seconds % p;
            p = p / 60;
            i++;
        }
        return result;
    }
}
