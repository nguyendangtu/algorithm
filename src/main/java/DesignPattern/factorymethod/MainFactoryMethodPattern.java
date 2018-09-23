package DesignPattern.factorymethod;

public class MainFactoryMethodPattern {
    public static void main(String args[]) {
        ShapeCreator shapeCreator = new CircleCreator();
        shapeCreator.draw();
    }
}

