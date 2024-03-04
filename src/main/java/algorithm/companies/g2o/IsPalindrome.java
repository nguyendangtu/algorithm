package algorithm.companies.g2o;

/**
 * @author : JOHNNGUYEN
 * @since : 8/5/2023, Sat
 **/
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("book"));
        System.out.println(isPalindrome("daad"));
        System.out.println(isPalindrome("aa"));
    }

    public static boolean isPalindrome(String input) {
        if (input == null || input == "") return false;
        int len = input.length();
        for (int i = 0; i <= len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
