package algorithm.companies.flexton;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : JOHNNGUYEN
 * @since : 8/12/2023, Sat
 **/

public class Flexton {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("C");
        Product p2 = new Product();
        p2.setName("A");
        Product p3 = new Product();
        p3.setName("B");
        Product p4 = new Product();
        p4.setName("B");

        List<Product> list = new ArrayList<>();
       // list = Collections.unmodifiableList(list);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        //Collections.sort(list, Comparator.comparing(Product::getName));
        list = list.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
     //  list.forEach(i->System.out.println(i.getName()));

        list = list.stream().distinct().collect(Collectors.toList());
        list.forEach(i->System.out.println(i.getName()));
    }
}


class Product {
    int id;
    String name;
    int price;
    int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && quantity == product.quantity && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity);
    }
}
