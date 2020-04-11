package algorithm.HackerRank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/***
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 *
 * Example 1:
 *
 * Input: 3
 * Output: "III"
 * Example 2:
 *
 * Input: 4
 * Output: "IV"
 * Example 3:
 *
 * Input: 9
 * Output: "IX"
 * Example 4:
 *
 * Input: 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 *
 * Input: 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class ConvertIntegerToRoman {

    public static void main(String args[]) {
        Integer number = 2187;
        System.out.println(intToRoman(number));
    }

    public static String intToRoman(int num) {
        String romanNumber = "";
        final Map<Integer, String> map = Collections.unmodifiableMap(new HashMap<Integer, String>() {{
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
            put(5, "V");
            put(6, "VI");
            put(7, "VII");
            put(8, "VIII");
            put(9, "IX");
            put(10, "X");
            put(20, "XX");
            put(30, "XXX");
            put(40, "XL");
            put(50, "L");
            put(60, "LX");
            put(70, "LXX");
            put(80, "LXXX");
            put(90, "XC");
            put(100, "C");
            put(200, "CC");
            put(300, "CCC");
            put(400, "CD");
            put(500, "D");
            put(600, "DC");
            put(700, "DCC");
            put(800, "DCCC");
            put(900, "CM");
            put(1000, "M");
        }});
        int[] numbers = new int[]{1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int devidenNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            devidenNumber = num / numbers[i];
            if (devidenNumber > 0) {
                for (int j = 0; j < devidenNumber; j++) {
                    romanNumber += map.get(numbers[i]);
                }
            }
            num = num % numbers[i];

        }

        return romanNumber;
    }

}
