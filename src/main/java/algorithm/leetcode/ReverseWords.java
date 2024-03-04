package algorithm.leetcode;

/**
 * @author : JOHNNGUYEN
 * @since : 9/14/2023, Thu
 **/
public class ReverseWords {
    public static void main(String[] args) {
        System.out.print("Start:");
        System.out.print(reverseWords("a good   example"));
        System.out.print(":End");
    }

    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            while (arr[i].contains(" ")) {
                arr[i] = arr[i].trim();
            }
        }

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != "") {
                result = result + arr[i] + " ";
            }
        }
        result += arr[arr.length - 1];
        return result;
    }
}
