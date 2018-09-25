package DesignPattern.behavioral.command;

public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}
