package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 02/05/2022 - 4:19 PM
 */
public class findSmallestBEQnumber {

    public static void main(String args[]) {
        System.out.println(findSmallestBEQnumber());
    }

    public static int findSmallestBEQnumber() {
        for (int i = 80; i < Integer.MAX_VALUE; i++) {
            if (findFourSixDigits(i * i * i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean findFourSixDigits(int n) {
        if (n < 6665) return false;
        int count = 0;
        while (n > 0) {
            if (n % 10 == 6) {
                count++;
            }
            n = n / 10;
        }
        return count == 4;
    }
}
