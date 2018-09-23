package DesignPattern.factorymethod;

public class CircleCreator extends ShapeCreator {
    @Override
    Shape getShape() {
        return new Circle();
    }
}
