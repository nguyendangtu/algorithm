package algorithm.leetcode;


import java.util.HashMap;

/**
 * @author : JOHNNGUYEN
 * @since : 4/30/2023, Sun
 **/
public class IsIsomorphic {
    public static void main(String[] args) {
        String s = "papap";
        String t = "titii";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null) return false;
        if (t == null) return false;
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (!map.containsKey(si)) {
                if (!map1.containsKey(ti)) {
                    map.put(si, ti);
                    map1.put(ti, si);
                } else {
                    return false;
                }
            } else if (map.get(si).charValue() != ti) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic1(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null) return false;
        if (t == null) return false;
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (null == map.get(s.charAt(i))) {
                if (null == map1.get(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                    map1.put(t.charAt(i), s.charAt(i));
                } else {
                    return false;
                }
            } else if (map.get(s.charAt(i)).charValue() != t.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}
