package algorithm.HackerRank;

/**
 * @author : JOHNNGUYEN
 * @since : 3/29/2023, Wed
 **/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
