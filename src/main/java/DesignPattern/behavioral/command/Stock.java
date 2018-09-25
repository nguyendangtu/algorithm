package DesignPattern.behavioral.command;

public class Stock {
    private String name;
    private int quantity;

    public Stock() {
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("buy [ " + name + " : " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("sell [ " + name + " : " + quantity + " ] sold");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
