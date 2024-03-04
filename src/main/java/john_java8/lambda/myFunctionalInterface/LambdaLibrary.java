package john_java8.lambda.myFunctionalInterface;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> NAME = (list, salary, c) -> {
        return list.stream()
                .filter(e -> e.getSalary() > salary)
                .filter(e -> e.getLastName().charAt(0) > c && e.getLastName().charAt(0) <= 'Z')
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));
    };
}
