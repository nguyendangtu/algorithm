package DesignPattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        orders.forEach(order -> order.execute());
    }
}
