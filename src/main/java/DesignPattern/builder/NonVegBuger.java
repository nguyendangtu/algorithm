package DesignPattern.builder;

public class NonVegBuger extends Buger {
    @Override
    public String name() {
        return "NonVegBuger";
    }

    @Override
    public double price() {
        return 25.5;
    }
}
