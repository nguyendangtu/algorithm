package edupath;

import java.util.HashMap;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 9:48 PM
 */
public class countFreq {

    public static void main(String args[]) {
        HashMap<Integer, Integer> map = countFreq1(new int[]{10, 20, 20, 10, 10, 20, 5, 20});
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }



    public static HashMap<Integer, Integer> countFreq1(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        return map;
    }
}
