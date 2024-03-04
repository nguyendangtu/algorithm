package algorithm.companies.flexton;

import java.util.Arrays;

/**
 * Given a string s containing both uppercase and lowercase letters.
 * Write a function to reverse the letters in the string, keeping the non-letter characters in their original positions.
 * <p>
 * // Example:
 * <p>
 * // Input: s = "a-bC-dEf-ghIj"
 * // Output: "j-Ih-gfE-dCba"
 *
 * @author : JOHNNGUYEN
 * @since : 8/12/2023, Sat
 **/
public class RevertString {
    public static void main(String[] args) {
        System.out.println(reverse("a-bC-dEf-ghIj"));
    }

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            if (!Character.isLetterOrDigit(chars[j])) {
                j--;
            }
            if (Character.isLetterOrDigit(chars[i]) && Character.isLetterOrDigit(chars[j])) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }

        return Arrays.toString(chars);
    }
}
