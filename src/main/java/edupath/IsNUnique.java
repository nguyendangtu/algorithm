package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 6:48 PM
 */
public class IsNUnique {
    public static void main(String args[]) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 5));
    }

    public static int isNUnique(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
                if (count == 2) {
                    return 0;
                }
            }
        return count;
    }
}
