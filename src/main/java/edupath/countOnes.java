package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithmn
 * @Created 02/05/2022 - 9:30 PM
 */
public class countOnes {

    public static void main(String args[]) {
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
        System.out.println(countOnes(9));
    }

    public static int countOnes(int n) {
        if (n < 0) return 0;
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) count++;
            n = n / 2;
        }
        return count;
    }
}
