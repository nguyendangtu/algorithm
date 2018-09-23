package DesignPattern.creational.builder;

public class Coca extends SoftDrink {
    @Override
    public String name() {
        return "Coca";
    }

    @Override
    public double price() {
        return 12.2;
    }
}
