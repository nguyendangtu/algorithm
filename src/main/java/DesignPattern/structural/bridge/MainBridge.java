package DesignPattern.structural.bridge;

public class MainBridge {
    public static void main(String args[]) {
        Shape greenCircle = new Circle(10, 20, 30, new GreenCircle());
        greenCircle.draw();
        Shape redCircle = new Circle(20, 30, 40, new RedCircle());
        redCircle.draw();
    }
}
