package algorithm.companies.kforce;

/**
 * @author : JOHNNGUYEN
 * @since : 7/9/2023, Sun
 **/
public class DigitManypulations {
    public static void main(String args[]) {
        System.out.println(digitManyPulation(123456));
        System.out.println(digitManyPulation(1010));
    }

    public static int digitManyPulation(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp;
            product *= tmp;
            n = n / 10;
        }
        return product - sum;
    }
}
