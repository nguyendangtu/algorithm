package algorithm.companies.kforce;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author : JOHNNGUYEN
 * @since : 7/9/2023, Sun
 **/
public class BeautifulString {
    public static void main(String[] args) {
        System.out.println(1 + 2.5d);
        System.out.println(isBeautifulString("bbbaacdafe"));
        System.out.println(isBeautifulString("aabbb"));
        System.out.println(isBeautifulString("bbc"));
        //  System.out.println(isBeautifulString("bbc"));
    }

    public static boolean isBeautifulString(String input) {
        if (input == null || input.length() == 0) return false;
        if (input.length() == 1) return true;

        HashMap<Integer, Integer> map = new HashMap<>();
        input.chars().forEach(c -> {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        });

        Integer max = map.get((int) 'a');
        if (max == null) return false;

        for (int i = 'b'; i <= 'z' && map.containsKey(i); i++) {
            int value = map.get(i);
            if (value > max) {
                return false;
            } else {
                max = value;
            }
        }

        return true;
    }
}
