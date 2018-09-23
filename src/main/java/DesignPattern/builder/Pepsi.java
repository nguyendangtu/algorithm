package DesignPattern.builder;

public class Pepsi extends SoftDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 10.2;
    }
}
