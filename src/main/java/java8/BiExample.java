package java8;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiExample {
    public static void main(String args[]) {
        letDoBiConsumer();
        letDoBiFunction();
        letDoBiPredicate();
    }

    public static void letDoBiConsumer() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Role", "Developer Lead");
        hashMap.put("Salary", "8k");
        hashMap.put("Environment", "Good");
        BiConsumer<String, String> biConsumer = (k, v) -> System.out.println("Key=" + k + ",value=" + v);
        System.out.println("BI CONSUMER EXAMPLE:");
        hashMap.forEach(biConsumer);
    }

    public static void letDoBiFunction() {
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "result=" + (num1 + num2);
        System.out.println("\nBI FUNCTION EXAMPLE");
        System.out.println(biFunction.apply(6, 2));
    }

    public static void letDoBiPredicate() {
        BiPredicate<Integer,String> biPredicate = (i,s)-> i > 8 && s.startsWith("J");
        System.out.println("BI PREDICATE EXAMPLE");
        System.out.println(biPredicate.test(6,"Join"));
        System.out.println(biPredicate.test(9,"John"));
        System.out.println(biPredicate.test(9,"Nick"));
    }
}
