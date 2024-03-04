package john_java8.lambda.practice1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.
                stream()
                .filter(t -> t.getYear() >= 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);


        // Query 2: What are all the unique cities where the traders work?
        System.out.println(transactions
                .stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.joining(",")));

        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions
                .stream()
                .map(t -> t.getTrader())
                .distinct()
                .filter(t -> "Cambridge".equalsIgnoreCase(t.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println(transactions
                .stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted(String::compareTo)
                .collect(Collectors.joining(" ")));


        // Query 5: Are there any trader based in Milan?
        System.out.println("result=" + transactions
                .stream()
                .anyMatch(t -> "Milan".equalsIgnoreCase(t.getTrader().getCity())));


        // Query 6: Update all transactions so that the traders from Milan a.re set to Cambridge.
        List<Transaction> transactionList = transactions
                .stream()
                .map(t -> {
                    if ("Milan".equalsIgnoreCase(t.getTrader().getCity())) {
                        t.getTrader().setCity("Cambridge");
                    }
                    return t;
                }).collect(toList());
        transactionList.forEach(System.out::println);

        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> max = transactions
                .stream()
                .map(t -> t.getValue())
                .max(Integer::compareTo);
        System.out.println("highest value : " + max.orElse(null));

        System.out.println(transactions.stream().mapToInt(t -> t.getValue()).max().getAsInt());

        Map<Integer, List<Transaction>> map = transactions.stream().collect(groupingBy(Transaction::getYear));
        map.forEach((k, v) -> System.out.println("key=" + k + ", value = " + v.size()));
    }
}
