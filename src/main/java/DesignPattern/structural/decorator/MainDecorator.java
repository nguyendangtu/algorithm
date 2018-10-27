package DesignPattern.structural.decorator;


public class MainDecorator {
    public static void main(String args[]) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        DecoratorShape decoratorShape = new RedDecoratorShape(circle);
        decoratorShape.draw();
        DecoratorShape decoratorShape1 = new RedDecoratorShape(rectangle);
        decoratorShape1.draw();

    }

}
