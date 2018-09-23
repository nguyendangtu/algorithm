package DesignPattern.factorymethod;

public abstract class ShapeCreator {
    public void draw() {
        Shape shape = getShape();
        shape.draw();
    }

    abstract Shape getShape();
}
