package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 11:31 PM
 */
public class ArrayHasNoZero {
    public static void main(String args[]) {

    }

    public static int arrayHasNoZero(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}
