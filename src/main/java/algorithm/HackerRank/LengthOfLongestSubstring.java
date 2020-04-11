package algorithm.HackerRank;

public class LengthOfLongestSubstring {

    public static void main(String args[]) {
        String input = "dvdf";
        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        boolean[] seenChars = new boolean[256];
        int i = 0, j = 0, ans = 0;
        int n = s.length();
        while (i < n && j < n) {

        }
        return -1;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String subString = "";
        int max = 0;
        int maxTemp = 0;
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            int index = subString.indexOf(val);
            if (index == -1) {
                maxTemp++;
                subString += val;
            } else {
                max = max > maxTemp ? max : maxTemp;
                int size = subString.length();

                if (index == size - 1) {
                    subString = "";
                } else if (size > 0) {
                    index = index + 1 < size ? index + 1 : size - 1;
                    subString = subString.substring(index, size);
                }

                subString += val;
                maxTemp = subString.length();
            }
        }


        return max > maxTemp ? max : maxTemp;
    }


}
