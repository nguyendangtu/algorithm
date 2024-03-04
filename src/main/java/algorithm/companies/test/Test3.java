package algorithm.companies.test;

/**
 * @author : JOHNNGUYEN
 * @since : 11/30/2023, Thu
 **/
public class Test3 {
    public static void main(String[] args) {
        long a = 88;
        Integer b = new Integer((int)a);
        Integer c = b + 0;
        Integer d = c;
        System.out.println(b==c);
        System.out.println(c==d);
    }
}
