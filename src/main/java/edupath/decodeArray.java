package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 11:11 PM
 */
public class decodeArray {

    public static void main(String args[]) {
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }

    public static int decodeArray(int a[]) {
        if (a == null || a.length == 0) return -1;
        int sign = 1;
        if (a[0] < 0) sign = -1;
        int result = 0;
        for (int i = 0; i < a.length - 1; i++) {
            result = result * 10 + Math.abs(a[i] - a[i + 1]);
        }
        return result * sign;
    }
}
