package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 7:24 PM
 */
public class isPacked {
    public static void main(String args[]) {
        //System.out.println(isPacked(new int[]{2, 2, 1, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
    }

    public static int isPacked(int[] a) {
        if (a == null || a.length == 0) return 1;
        if (a.length == 1) {
            return a[0] == 1 ? 1 : 0;
        }

        int min = min(a);
        if (min < 0) return 0;
        int max = max(a);

        int counts[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            counts[a[i]]++;
        }

        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            count++;
            if (a[i] != counts[a[i]]) {
                return 0;
            }
            if (a[i] != a[i + 1]) {
                if (count != counts[a[i]]) {
                    return 0;
                }
                count = 0;
            }
        }
        return 1;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

}
