package john_java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaLibrary {

    public static final BiFunction<List<String>, String, Stream<String>> Q1
            = (list, sw) -> list.stream().filter(x -> x.startsWith(sw));

    public static final Function<List<String>, Stream<Integer>> Q2 =
            (input) -> input.stream().map(String::length);


    public static void main1(String args[]) {
        List<String> names = new ArrayList<>(Arrays.asList("Java",
                "C++", "Android", "Angular", "Html", "Kotlin"));
        IntSummaryStatistics summaryStatistics =
                names.stream().collect(Collectors.summarizingInt(String::length));
        System.out.println(summaryStatistics);

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getSum());

        Stream<String> stm = names.stream().filter(x->x.startsWith("A"));
        List<String> result = stm.collect(Collectors.toList());
        result.forEach(System.out::println);

        long count = getStream(names, "A").count();
        System.out.println(count);

        Stream<String> res2 = Q1.apply(names, "K");
        res2.collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(res2.count());
    }

    public static Stream<String> getStream(List<String> list, String sw){
        return list.stream().filter(x->x.startsWith(sw));
    }

    public static void main(String args[]){
        List<String> names = new ArrayList<>(Arrays.asList("Java",
                "C++","Android","Angular","Html","Kotlin"));
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        // Code1 - Filter the names length>5

        List<String> result1 = names.stream().filter(i->i.length()> 5).collect(Collectors.toList());
        result1.forEach(System.out::println);

        // Slide -14 - Creation of Stream
        Integer[] arrOfInt = {1, 3, 5, 7};
        Stream<Integer> integerStream = Stream.of(arrOfInt);
        System.out.println(integerStream.count());

        int[] arrOfInt1 = {1, 3, 5, 7};
        Stream<int[]> list1 = Stream.of(arrOfInt1);
        System.out.println(list1.count());

        IntStream list2 = IntStream.of(arrOfInt1);
        System.out.println(list2.count());

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        song.forEach(System.out::println);


        Stream.generate(()->"Java").limit(5).forEach(System.out::println);

        Stream<Double> randoms = Stream.generate(()->Math.random());
        randoms.limit(5).forEach(System.out::println);


        Stream<Double> randoms1 = Stream.generate(()->Math.random());
        randoms1.limit(5).forEach(System.out::println);

        Stream<Integer> stream2  = Stream.iterate(1,n->n+2);
        stream2.skip(3)
                .limit(5)
                .forEach(System.out::println);

        Stream<Character> c1 = Stream.of('H','e','l','l','o');
        Stream<Character> c2 = Stream.of('J','a','v','a');
        Stream<Character> c3 = Stream.concat(c1, c2);
        c3.forEach(x-> System.out.print(x+" "));

        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a  - b;
        System.out.println("a="+ a + "b="+b);

    }


}
