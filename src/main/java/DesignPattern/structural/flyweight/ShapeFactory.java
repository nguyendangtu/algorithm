package DesignPattern.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    public static  HashMap hashMap = new HashMap<String, Shape>();;

    public static Circle getCircle(String color) {
        Circle circle = (Circle) hashMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            System.out.println("Create a new Circle with color " + color);
            hashMap.put(color, circle);
        }
        return circle;
    }


}
