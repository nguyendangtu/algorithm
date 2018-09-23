package DesignPattern.creational.factory;

public class MainFactoryPattern {
    public static void main(String args[]) {
        Shape square = ShapeFactory.getShape("SQUARE");
        Shape circle = ShapeFactory.getShape("CIRCLE");
        Shape recTangle = ShapeFactory.getShape("RECTANGLE");
        square.draw();
        circle.draw();
        recTangle.draw();
    }
}
