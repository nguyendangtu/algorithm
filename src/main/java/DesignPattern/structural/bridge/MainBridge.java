package DesignPattern.structural.bridge;

/***
 * decouple an abstraction from its implementation so that the two can vary independently
 */
public class MainBridge {
    public static void main(String args[]) {
        Shape greenCircle = new Circle(10, 20, 30, new GreenCircle());
        greenCircle.draw();
        Shape redCircle = new Circle(20, 30, 40, new RedCircle());
        redCircle.draw();
    }
}
