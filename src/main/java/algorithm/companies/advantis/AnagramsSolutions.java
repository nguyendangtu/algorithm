package algorithm.companies.advantis;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : JOHNNGUYEN
 * @since : 7/9/2023, Sun
 **/
public class AnagramsSolutions {
    public static void main(String[] args) {
        System.out.println(isAnagrams("bored cat", "act robed"));
        System.out.println(isAnagrams("anagra nam tac", "mna nagara atc"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagrams(String s, String t) {
        if (s == null || t == null) return false;
        String[] ss = s.split(" ");
        String[] tt = t.split(" ");
        if (ss.length != tt.length) return false;
        int count = 0;
        HashMap<Integer, Integer> tracking = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < tt.length; j++) {
                if (tracking.containsKey(j)) continue;
                if (ss[i].length() == tt[j].length() && isAnagram(ss[i], tt[j])) {
                    count++;
                    tracking.put(j, j);
                }
            }
        }
        return count == ss.length;
    }


}
