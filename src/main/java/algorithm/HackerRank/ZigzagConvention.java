package algorithm.HackerRank;

public class ZigzagConvention {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String output = convert(s, numRows);
        System.out.println("" + output);
        System.out.println("" + output.equals("PINALSIGYAHRPI"));
        //PAYPALISHIRING
        //PINALSIGYAHRPI
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String[] arrays = new String[numRows];
        int i = 0, zzIndex = -1, sign = 1;
        for (int j = 0; j < numRows; j++) {
            arrays[j] = "";
        }
        while (i < s.length()) {
            if (zzIndex == 0) {
                sign = 1;
            } else if (zzIndex == numRows - 1) {
                sign = -1;
            }
            zzIndex += sign;
            arrays[zzIndex] += s.charAt(i++);
        }
        String output = "";
        for (i = 0; i < numRows; i++) {
            output += arrays[i];
        }
        return output;
    }
}
