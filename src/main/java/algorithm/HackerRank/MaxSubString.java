package algorithm.HackerRank;

public class MaxSubString {
    public static void main(String args[]) {
        String input = "baba";
        System.out.println(maxSubString(input));
        String input1 = "banananbna";
        System.out.println(maxSubString(input1));

    }

    public static String maxSubString(String input) {
        char maxChar = input.charAt(0);
        int maxIndex = 0;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > maxChar) {
                maxChar = input.charAt(i);
                maxIndex = i;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == maxChar && i != maxIndex) {
                int c = 0;
                while (i + c < input.length() && input.charAt(i + c) == input.charAt(maxIndex + c)) {
                    c++;
                }
                if (c + i == input.length()) {
                    return input.substring(maxIndex);
                } else {
                    if (input.charAt(i + c) > input.charAt(maxIndex + c)) {
                        maxChar = input.charAt(i + c);
                        maxIndex = i + c - 1;
                    }
                }
            }
        }

        return input.substring(maxIndex);

    }
}
