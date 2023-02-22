package algorithm.HackerRank;


public class SmallestString {

    public static void main(String[] args) {
        System.out.println(solution("01010"));
        System.out.println(solution("111000"));
        System.out.println(solution("111*000"));
        System.out.println(solution("111*0001"));
    }

    public static int solution(String input) {
        if (null == input || input.length() == 0) return 0;
        if (input.length() == 1) return 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == '0' && input.charAt(i + 1) == '1') || (input.charAt(i) == '1' && input.charAt(i + 1) == '0')) {
                if (i == 0) {
                    return solution(input.substring(2));
                } else if (i == input.length() - 2) {
                    return solution(input.substring(0, input.length() - 2));
                } else {
                    return solution(input.substring(0, i) + input.substring(i + 2, input.length()));
                }
            }
        }
        return input.length();
    }
}
