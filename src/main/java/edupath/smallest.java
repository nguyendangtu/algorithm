package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 3:48 PM
 */
public class smallest {

    public static void main(String args[]) {
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    public static int smallest(int n) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int number = i * j;
                while (number > 0) {
                    if (number % 10 == 2) {
                        count++;
                        break;
                    }
                    number = number / 10;
                }
            }
            if (count == n) {
                return i;
            }
        }

        return -1;
    }
}
