package algorithm.leetcode;

/**
 * @author : JOHNNGUYEN
 * @since : 7/25/2023, Tue
 **/
public class Remove01 {
    public static void main(String[] args) {
        System.out.println(solution("0101010"));
    }

    public static int solution(String s) {
        if (s == null || s.length() == 0) return 0;
        int lengthAfter = s.length(), lengthBefore = s.length();
        do {
            lengthBefore = s.length();
            s = s.replace("01", "").replace("10", "");
            lengthAfter = s.length();
        } while (lengthBefore != lengthAfter);
        return s.length();

    }
}
