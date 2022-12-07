import java.util.HashMap;
import java.util.List;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 03/05/2022 - 5:13 AM
 */
public class Test1 {

    public static void main(String args[]) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
        System.out.println(hasNValues(new int[]{}, 0));
        System.out.println(hasNValues(new int[]{}, -1));
        System.out.println(hasNValues(null, 0));

    }


    public static int hasNValues(int[] a, int n) {
        if (n < 0) return 0;
        if ((a == null || a.length == 0) && n == 0) {
            return 1;
        }

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], a[i]);
        }

        if (map.size() == n) return 1;

        return 0;
    }


}
