package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 30/04/2022 - 9:39 PM
 */
public class isCubePowerful {
    public static void main(String args[]) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    public static int isCubePowerful(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        int m = n;
        while (m > 0) {
            int k = m % 10;
            sum = sum + k * k * k;
            m = m / 10;
        }
        if (sum == n) return 1;
        return 0;
    }
}
