package algorithm.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinations {

    public static void main(String args[]) {
        String digits = " ";
        List<String> output = letterCombinations(digits);
        output.forEach(System.out::println);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if (digits == null || digits == "" || digits.trim() == "" || digits.length() > 2) {
            return output;
        }

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        String first = "";
        String second = "";
        if (digits.length() == 1) {
            first = map.get("" + digits.charAt(0));
            if (null != first && first != "") {
                for (int i = 0; i < first.length(); i++) {
                    output.add("" + first.charAt(i));
                }
            }
        } else if (digits.length() == 2) {
            first = map.get("" + digits.charAt(0));
            second = map.get("" + digits.charAt(1));
            if (first != null && first != "") {
                for (int i = 0; i < first.length(); i++) {
                    if (second != null && second != "") {
                        for (int j = 0; j < second.length(); j++) {
                            output.add(first.charAt(i) + "" + second.charAt(j));
                        }
                    } else {
                        output.add("" + first.charAt(i));
                    }
                }
            }
        }
        return output;
    }
}
