package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 12:37 AM
 */
public class decodeArray1 {
    public static void main(String args[]) {
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0, 1}));
        System.out.println(decodeArray(new int[]{-1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));

    }

    public static int decodeArray(int a[]) {
        if (a == null || a.length == 0) {
            return 0;
        }
        int sign = 1;
        int start = 0;
        if (a[0] < 0) {
            sign = -1;
            start = 1;
        }

        int num = 0;
        int sum = 0;
        for (int i = start; i < a.length; i++) {
            if (a[i] == 0) {
                num++;
            } else {
                sum = sum * 10 + num;
                num = 0;
            }
        }
        return sum * sign;
    }
}
