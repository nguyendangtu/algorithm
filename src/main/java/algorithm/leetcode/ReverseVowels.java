package algorithm.leetcode;

import java.util.Arrays;

/**
 * @author : JOHNNGUYEN
 * @since : 4/30/2023, Sun
 **/
public class ReverseVowels {
    public static void main(String[] args) {
        String s = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] result = s.toCharArray();
        StringBuilder strB = new StringBuilder(s);
        int j = result.length - 1;
        int i = 0;
        while (i <= result.length - 1 && j >= i) {
            if (!isVowels(result[i])) {
                i++;
                continue;
            }
            if (!isVowels(result[j])) {
                j--;
                continue;
            }
            strB.setCharAt(i, result[j]);
            strB.setCharAt(j, result[i]);
            result[i] = result[j];
            i++;
            j--;

        }
        return strB.toString();

    }

    public static boolean isVowels(char s) {
        switch (s) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }
}
