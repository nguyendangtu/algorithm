package edupath;

import java.util.HashMap;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 9:37 AM
 */
public class StantonMeasure {

    public static void main(String args[]) {
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
    }

    public static int stantonMeasure(int[] a) {
        if (a == null || a.length == 0) return 0;
        if (a.length == 1) return 1;
        int min = min(a);
        int max = max(a);
        int[] counts = new int[max + 1];
        for (int i = min; i < max + 1; i++) {
            counts[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            counts[a[i]]++;
        }

        int maxCount = counts[min];
        for (int i = min + 1; i <= max; i++) {
            if (counts[i] == 0) {
                return 0;
            }

            if (counts[i] > maxCount) {
                maxCount = counts[i];
            }
        }
        return maxCount;
    }

    public static int max(int a[]) {
        if (a.length == 1) return a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int a[]) {
        if (a.length == 1) return a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
