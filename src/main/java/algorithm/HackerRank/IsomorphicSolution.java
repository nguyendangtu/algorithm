package algorithm.HackerRank;

import java.util.HashMap;

/***
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 */
public class IsomorphicSolution {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "aa";
        System.out.println("Isomorphic is " + isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (null == s || null == t) return false;
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap1.containsKey("" + s.charAt(i))) {
                if (!(t.charAt(i) == t.charAt(hashMap1.get("" + s.charAt(i))))) {
                    return false;
                }
            } else {
                hashMap1.put("" + s.charAt(i), i);
            }

            if (hashMap2.containsKey("" + t.charAt(i))) {
                if (!(s.charAt(i) == s.charAt(hashMap2.get("" + t.charAt(i))))) {
                    return false;
                }
            } else {
                hashMap2.put("" + t.charAt(i), i);
            }
        }
        return true;
    }
}
