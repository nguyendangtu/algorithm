package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 19/04/2022 - 10:04 PM
 */
public class NUpCount {

    public static void main(String args[]) {
        int a[] = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        //System.out.println(nUpCount(a, n));

        int a1[] = {6, 3, 1};
        System.out.println(nUpCount(a1, 6));

        System.out.println(nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20));
    }

    public static int nUpCount(int a[], int n) {
        int nUpCount = 0;
        int sum = 0;
        int previousSum = 0;
        for (int i = 0; i < a.length; i++) {
            previousSum = sum;
            sum += a[i];
            if (previousSum <= n && sum > n) {
                nUpCount++;
            }
        }
        return nUpCount;
    }
}
