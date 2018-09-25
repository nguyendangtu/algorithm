package DesignPattern.behavioral.command;

public class SellStock implements Order {
    Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
