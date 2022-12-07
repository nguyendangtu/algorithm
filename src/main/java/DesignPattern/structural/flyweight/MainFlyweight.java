package DesignPattern.structural.flyweight;

import java.util.Random;

/***
 * minimizes memory usage by sharing some of its data with other similar objects.
 */
public class MainFlyweight {
    private static final String[] colors = {"Red", "Green", "Blue", "Black", "White"};

    public static void main(String args[]) {

        for (int i = 0; i < 20; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }

    public static int getRandom() {
        return new Random().nextInt(100);
    }
}
