package DesignPattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showPrices() {
        items.forEach(i -> {
            System.out.println("Name: " + i.name());
            System.out.println("Price: " + i.price());
            System.out.println("Packing: " + i.packing().pack());
        });
    }

}
