package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 11:15 AM
 */
public class IsTrivalent {

    public static void main(String args[]) {
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }

    public static int isTrivalent(int a[]) {
        if (a == null || a.length < 3) return 0;
        int counts[] = new int[3];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = a[0];
        }

        int j = 1;
        for (int i = 1; i < a.length; i++) {
            if (!isExistingItem(counts, a[i])) {
                if (j > 2) {
                    return 0;
                }
                counts[j++] = a[i];
            }
        }

        return j == 3 ? 1 : 0;
    }

    public static boolean isExistingItem(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return true;
            }
        }
        return false;
    }
}
