package algorithm.HackerRank;

public class StringToInteger {
    public static void main(String[] args) {
        String input = "-2-";
        int result = myAtoi(input);
        System.out.println(result);
    }

    public static int myAtoi(String str) {
        int output = 0;
        String result = "";
        int sign = 1;
        boolean isSigned = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int length = result.length();
            if (ch == ' ') {
                if (length > 0) {
                    break;
                }

                continue;
            } else if (ch == '-' || ch == '+') {
                if (length > 0) {
                    break;
                } else {
                    result += ch;
                    isSigned = true;
                    sign = ch == '+' ? 1 : -1;
                    continue;
                }
            } else if (ch >= '0' && ch <= '9') {
                result += ch;
            } else if (length < 1) {
                return 0;
            } else {
                break;
            }
        }

        for (int i = isSigned ? 1 : 0; i < result.length(); i++) {
            double powValue = Math.pow(10, result.length() - 1 - i) * getInt(result.charAt(i));
            double outputTmp = (output + powValue) * sign;

            if (outputTmp >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (outputTmp <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            output = output + (int) powValue;
        }

        return output * sign;
    }

    public static int getInt(char ch) {
        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }


}
