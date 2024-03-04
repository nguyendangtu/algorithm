package algorithm.companies.g2o;

/**
 * @author : JOHNNGUYEN
 * @since : 8/5/2023, Sat
 **/
public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
        System.out.println(mirrorEnds("cabac"));
        System.out.println(mirrorEnds("acca"));


    }

    public static String mirrorEnds(String input) {
        if (input == null || input == "") return input;
        int len = input.length();
        String result = "";
        for (int i = 0; i <= len / 2; i++) {
            if (input.charAt(i) == input.charAt(len - 1 - i)) {
                result += input.charAt(i);
            } else {
                return result;
            }
        }
        if (result.length() == len / 2 + 1) return input;
        return result;
    }
}
