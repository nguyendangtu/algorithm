package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 10:48 PM
 */
public class isLegalNumber {
    public static void main(String args[]) {
        System.out.println(isLegalNumber(new int[]{1, 0, 1, 1}, 2));
        System.out.println(isLegalNumber(new int[]{1, 1, 2}, 3));
        System.out.println(isLegalNumber(new int[]{3, 2, 5}, 8));
        System.out.println(isLegalNumber(new int[]{3, 7, 1}, 6));

    }

    public static int isLegalNumber(int a[], int n) {
        int sum = 0;
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > n || a[i] < 0) {
                return 0;
            }
            sum += a[i] * Math.pow(n, j++);
        }
        return sum;
    }
}
