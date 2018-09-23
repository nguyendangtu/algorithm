package DesignPattern.creational.factorymethod;

public class SquareCreator extends ShapeCreator {
    @Override
    Shape getShape() {
        return new Square();
    }
}
