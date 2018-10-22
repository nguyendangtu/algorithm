package DesignPattern.structural.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Green Circle with radius" + radius + " x = " + x + ", y = " + y);
    }
}
