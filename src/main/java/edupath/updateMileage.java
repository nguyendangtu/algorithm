package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 1:09 PM
 */
public class updateMileage {

    public static void main(String args[]) {
        int[] a = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileage(a, 13);
        for (int i : a) {
            System.out.print(i);
        }
    }

    public static void updateMileage(int a[], int miles) {
        int i = 0;
        int added = miles;
        while (i < a.length && added > 0) {
            a[i] = a[i] + added;
            added = a[i] / 10;
            a[i] = a[i] % 10;
            i++;
        }
    }
}
