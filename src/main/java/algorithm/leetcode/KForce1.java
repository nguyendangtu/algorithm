package algorithm.leetcode;

import java.util.List;
import java.util.Set;

/**
 * @author : JOHNNGUYEN
 * @since : 5/3/2023, Wed
 **/
public class KForce1 {
    public static void main(String[] args) {
        List<Integer> a;
        Set<Integer> b;
        System.out.println(solution(123456));
    }

    public static int solution(int n){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int m = n%10;
            sum += m;
            product*=m;
            n=n/10;
        }
        return product  - sum;
    }
}
