package DesignPattern.structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Red Circle with radius" + radius + " x = " + x + ", y = " + y);
    }
}
