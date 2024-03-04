package algorithm.companies.walmart;

/**
 * @author : JOHNNGUYEN
 * @since : 9/1/2023, Fri
 **/
public class Solution {

    public static void main(String[] args) {
        System.out.println(decrypt("dnotq"));
    }

    static String decrypt(String word) {
        // your code goes here
        char[] chars = word.toCharArray();

        String output = "";
        for (int i = 1; i < chars.length; i++) {
            while (chars[i] - chars[i - 1] < 'a') {
                chars[i] += 26;
            }
            chars[i] -= chars[i - 1];
        }
        chars[0] -= 1;

        for (int i = 0; i < chars.length; i++) {
            output += chars[i];
        }
        return output;
    }
}
