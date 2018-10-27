package DesignPattern.structural.decorator;

public abstract class DecoratorShape implements Shape {

    protected Shape decoratorShape;

    public DecoratorShape(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        this.decoratorShape.draw();
    }
}
