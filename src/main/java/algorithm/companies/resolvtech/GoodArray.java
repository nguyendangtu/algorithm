package algorithm.companies.resolvtech;

/**
 * @author : JOHNNGUYEN
 * @since : 1/7/2024, Sun
 **/
public class GoodArray {
    public static void main(String[] args) {
        System.out.println(goodArray(3, 3));
        System.out.println(goodArray(3, 2));
        System.out.println(goodArray(1, 1));
    }

    public static int goodArray(int N, int X) {
        int result = -404;
        if (X > N) return -404;
        if(X <= N) return 2;

        return result;
    }
}
