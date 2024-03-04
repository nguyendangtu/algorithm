package john_java8.lambda.myFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        TriFunction<List<Employee>, Integer, Character, String> name =
                (le, s, c) -> le.stream().filter(e -> e.getSalary() > s)
                        .filter(e -> e.getLastName().charAt(0) <= 'Z' && e.getLastName().charAt(0) > c)
                        .map(e -> e.getFirstName() + " " + e.getLastName())
                        .sorted()
                        .collect(Collectors.joining(", "));

        System.out.println(name.apply(list, 100000, 'M'));

        System.out.println(LambdaLibrary.NAME.apply(list, 100000, 'M'));
    }

}
