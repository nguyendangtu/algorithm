package DesignPattern.behavioral.nullObject;

public class CustomerFactory {
    private static String[] names = new String[]{"John", "Nguyen", "TA"};

    public static AbstractCustomer getCustomer(String input) {
        for (String name : names) {
            if (name.equalsIgnoreCase(input)) return new RealCustomer(input);
        }
        return new NullCustomer();
    }
}
