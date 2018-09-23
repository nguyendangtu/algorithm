package DesignPattern.factorymethod;

public class SquareCreator extends ShapeCreator {
    @Override
    Shape getShape() {
        return new Square();
    }
}
