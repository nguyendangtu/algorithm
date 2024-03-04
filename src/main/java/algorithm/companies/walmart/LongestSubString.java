package algorithm.companies.walmart;

/**
 * 1.	Length of the longest substring without repeating characters
 * Given a string str, find the length of the longest substring without repeating characters.
 * Example:
 * For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
 * For “BBBB” the longest substring is “B”, with length 1.
 *
 * @author : JOHNNGUYEN
 * @since : 8/30/2023, Wed
 **/
public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubString("ABDEFGABEF"));
        System.out.println(longestSubString("BBBB"));
        System.out.println(longestSubString("xyzbbbbhhhay"));
    }


    public static int longestSubString(String s) {
        String sub = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sub.contains(c + "")) {
                if (sub.length() >= max) {
                    max = sub.length();
                }
                sub = sub.substring(sub.indexOf(c) + 1);
            }
            sub += c;
        }
        return max;
    }
}
