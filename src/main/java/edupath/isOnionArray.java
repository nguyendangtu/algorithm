package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 8:22 AM
 */
public class isOnionArray {
    public static void main(String args[]) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));
        System.out.println(isOnionArray(new int[]{2}));
        System.out.println(isOnionArray(new int[]{}));
        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12}));


    }

    public static int isOnionArray(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            if ((a[i] + a[a.length - 1 - i]) > 10) {
                return 0;
            }
        }
        return 1;
    }
}
