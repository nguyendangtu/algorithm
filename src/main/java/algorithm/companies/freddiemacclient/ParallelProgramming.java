package algorithm.companies.freddiemacclient;

import java.util.Arrays;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 8/20/2023, Sun
 **/
public class ParallelProgramming {
    public static void main(String[] args) {
        parallelStream();
    }

    public static void parallelStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sum = list.parallelStream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        int sum1 = list.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }

}
