package algorithm.leetcode;

import java.util.HashMap;

/**
 * @author : JOHNNGUYEN
 * @since : 4/30/2023, Sun
 **/
public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map1 = new HashMap<>();
        String[] array = s.split(" ");
        if (array.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            String data = map.get(pattern.charAt(i));
            if (null == data) {
                if (null == map1.get(array[i])) {
                    map.put(pattern.charAt(i), array[i]);
                    map1.put(array[i], pattern.charAt(i));
                } else {
                    return false;
                }

            } else if (!data.equalsIgnoreCase(array[i])) {
                return false;
            }
        }
        return true;
    }
}
