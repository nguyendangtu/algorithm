package algorithm.HackerRank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 15/05/2020 - 9:25 AM
 */
public class ConvertRomanToInteger {
    public static int parseFromRomanToInteger(String inputStringNumber) {
        char[] romanNumbers = inputStringNumber.toCharArray();
        int count = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (i + 1 < romanNumbers.length) {
                if (lookup().get(romanNumbers[i]) >= lookup().get(romanNumbers[i + 1])) {
                    count += lookup().get(romanNumbers[i]);
                } else {
                    count = count + lookup().get(romanNumbers[i + 1]) - lookup().get(romanNumbers[i]);
                    i++;
                }
            } else {
                count += lookup().get(romanNumbers[i]);
                i++;
            }
        }
        return count;
    }

    private static Map<Character, Integer> lookup() {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        return Collections.unmodifiableMap(map);
    }
}
