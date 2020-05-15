package john_java8;

import java.util.function.Consumer;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 12/04/2020 - 11:50 PM
 */
public class ConsumerExample {
    public static void main(String args[]) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello");
        try{

        }finally {
            System.out.println("");
        }
    }
}
