package john_java8.lambda;

import java.util.*;
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

        Stream<String> stm = names.stream().filter(x -> x.startsWith("A"));
        List<String> result = stm.collect(Collectors.toList());
        result.forEach(System.out::println);

        long count = getStream(names, "A").count();
        System.out.println(count);

        Stream<String> res2 = Q1.apply(names, "K");
        res2.collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(res2.count());
    }

    public static Stream<String> getStream(List<String> list, String sw) {
        return list.stream().filter(x -> x.startsWith(sw));
    }

    public static void main(String args[]) {
        List<String> names = new ArrayList<>(Arrays.asList("Java",
                "C++", "Android", "Angular", "Html", "Kotlin"));
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        // Code1 - Filter the names length>5

        List<String> result1 = names.stream().filter(i -> i.length() > 5).collect(Collectors.toList());
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


        Stream.generate(() -> "Java").limit(5).forEach(System.out::println);

        Stream<Double> randoms = Stream.generate(() -> Math.random());
        randoms.limit(5).forEach(System.out::println);


        Stream<Double> randoms1 = Stream.generate(() -> Math.random());
        randoms1.limit(5).forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(1, n -> n + 2);
        stream2.skip(3)
                .limit(5)
                .forEach(System.out::println);

        Stream<Character> c1 = Stream.of('H', 'e', 'l', 'l', 'o');
        Stream<Character> c2 = Stream.of('J', 'a', 'v', 'a');
        Stream<Character> c3 = Stream.concat(c1, c2);
        c3.forEach(x -> System.out.print(x + " "));


        //Joining String
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(",")));

        //IntStream
        IntStream myIntStream = IntStream.of(1, 7, 2, 6, 9, 10, 4);
        IntSummaryStatistics intSummaryStatistics = myIntStream.summaryStatistics();
        System.out.println("Max=" + intSummaryStatistics.getMax());
        System.out.println("Max=" + intSummaryStatistics.getMin());

        /***
         * Implement a given method requirement using Lambdas and streams in a Java 8 way.
         *  public int countWords(List<String> words, char c, char d, int len)
         * which counts the number of words in the input list words that have length equal to len, that
         * contain the character c, and that do not contain the character d.
         */
        List<String> list = Arrays.asList("Tom", "Jerry", "Salm", "John", "Tony", "Renuka");
        System.out.println("word count = " + countWords(list, 'o', 'y', 4));

        /***
         * Implement a method
         * public static void printSquares(int num)
         * which creates an IntStream using the iterate method. The method prints to the console the first
         * num squares. For instance, if num = 4, then your method would output 1, 4, 9, 16. Note: You
         * will need to come up with a function to be used in the second argument of iterate
         */
        printSquares(4);

        //Union set
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("A", "B"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("D"));
        LinkedHashSet<String> set3 = new LinkedHashSet<>(Arrays.asList("1", "3", "5"));
        List<Set<String>> setList = Arrays.asList(set1, set2, set3);

        Set<String> stringSet = union(setList);

        System.out.println(stringSet.stream().collect(Collectors.joining(",")));


        //
        List<Employee> listEmployee = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        //your stream pipeline here
        String res = listEmployee.stream()
                .filter(e -> e.getSalary() > 100000)
                .filter(e -> e.getLastName().charAt(0) <= 'Z' && e.getLastName().charAt(0) > 'M')
                .map(x -> x.getFirstName() + " " + x.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(res);

        //INT ARRAY
        List<Integer> ints = Arrays.asList(3,5,2,3,8);
        List<int[]> intArrs = ints.stream()
                .map(int[]::new)
                .collect(Collectors.toList());
        List<String> intArrsStr = intArrs.stream()
                .map(Arrays::toString)
                .collect(Collectors.toList());
        System.out.println(intArrsStr);


    }

    public static int countWords(List<String> words, char c, char d, int len) {
        if (words == null || words.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(words.stream()
                .filter(w -> w.length() == len)
                .filter(w -> w.contains("" + c))
                .filter(w -> !w.contains("" + d))
                .count() + "");
    }

    public static void printSquares(int num) {
        Function<Integer, Integer> square = (x) -> x * x;//FUNCTION
        IntStream.iterate(1, n -> n + 1)
                .limit(num)
                .map(x -> square.apply(x))
                .forEach(System.out::println);
    }

    public static Set<String> union(List<Set<String>> sets) {
        if (sets == null || sets.isEmpty()) return null;

        return sets.stream()
                .reduce(new TreeSet<>(),(s1, s2) -> Stream.concat(s1.stream(), s2.stream())
                        .collect(Collectors.toCollection(TreeSet::new)));
        /*return sets.stream()
                .reduce(new TreeSet<>(), (s1,s2) -> Stream.concat(s1.stream(),s2.stream())
                        .collect(Collectors.toSet()));*/
    }



}
