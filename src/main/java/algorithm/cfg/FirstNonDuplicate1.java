package algorithm.cfg;

import org.apache.logging.log4j.util.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 04/09/2022 - 4:19 AM
 */
public class FirstNonDuplicate1 {
    public static void main(String[] args) {
        String input = "ABCDEFGKLMNA";
        System.out.println(firstNonDuplicate(input));
    }

    public static String firstNonDuplicate(String input) {
        int a[] = new int[256];
        for (int i = 0; i < input.length(); i++) {
            a[input.charAt(i)] += 1;
        }

        for (int i = 0; i < input.length(); i++) {
            if (a[input.charAt(i)] == 1) {
                return "" + input.charAt(i);
            }
        }
        return Strings.EMPTY;
    }
}
