package algorithm.HackerRank;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 23/05/2020 - 11:43 AM
 */
public class MinSubString {
    public static String findShortedSubStringWithOrder(String s, String t) {
        int subLength = t.length();
        int j = 0;
        String shortedString = s;
        String tempString = "";
        for (int i = 0; i < s.length(); i++) {
            tempString += s.charAt(i);
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            if (j == subLength) {
                if (tempString.length() < shortedString.length()) {
                    shortedString = tempString;
                }

                tempString = "";
                j = 0;
            }
        }
        return shortedString;
    }

    /***
     * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
     *
     * Example:
     *
     * Input: S = "ADOBECODEBANC", T = "ABC"
     * Output: "BANC"
     * Note:
     *
     * If there is no such window in S that covers all characters in T, return the empty string "".
     * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
     * @param s
     * @param t
     * @return
     */
    public static String minWindow(String s, String t) {
        //ADOBECODEBANC
        //
        //ADOBEC
        //BECODEBA
        //CODEBA
        //BANC
        String temp = t;
        String tempString = "";
        String shortedString = s;
        
        int count = 0;
        boolean isNotFound = true;
        String mainChars = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            tempString += s.charAt(i);
            if (temp.indexOf(s.charAt(i)) != -1) {
                mainChars += s.charAt(i);
                if (temp.indexOf(s.charAt(i)) == 0) {
                    temp = temp.substring(1);
                } else if (temp.indexOf(s.charAt(i)) == temp.length() - 1) {
                    temp = temp.substring(0, temp.length() - 1);
                } else {
                    temp = temp.substring(0, temp.indexOf(s.charAt(i))) + temp.substring(temp.indexOf(s.charAt(i) + 1));
                }
                count++;
            }


            if (count == t.length()) {
                if (tempString.length() < shortedString.length()) {
                    shortedString = tempString;
                }

                isNotFound = false;
                tempString = tempString.substring(tempString.indexOf(mainChars.charAt(++index)));
                temp = t;
                count = count - 1;
                if (temp.indexOf(tempString.charAt(0)) == 0) {
                    temp = temp.substring(1);
                } else if (temp.indexOf(tempString.charAt(0)) == temp.length() - 1) {
                    temp = temp.substring(0, temp.length() - 1);
                } else {
                    temp = temp.substring(0, temp.indexOf(tempString.charAt(0))) + temp.substring(temp.indexOf(tempString.charAt(0)) + 1);
                }
            }
        }

        if (isNotFound) {
            return "";
        }

        return shortedString;
    }
}
