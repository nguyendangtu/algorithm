package john_java8.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : JOHNNGUYEN
 * @since : 8/15/2023, Tue
 **/
public class StreamVsParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sequence Stream");
        numbers.stream().map(n -> n * 2).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Parallel Stream");
        numbers.parallelStream().map(n -> n * 2).collect(Collectors.toList()).forEach(System.out::println);

    }
}
