package DesignPattern.behavioral.command;

/***
 *  Encapsulate a request in an object
 *  Allows the parameterization of clients with different requests
 *  Allows saving the requests in a queue
 */
public class MainCommand {
    public static void main(String args[]) {

        Broker broker = new Broker();

        Stock stock1 = new Stock("MU7", 1000);
        Stock stock2 = new Stock("JPM", 2000);

        BuyStock buyStock = new BuyStock(stock1);
        SellStock sellStock = new SellStock(stock2);
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
