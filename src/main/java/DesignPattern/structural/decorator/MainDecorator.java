package DesignPattern.structural.decorator;

/***
 * the decorator pattern is a design pattern that allows behavior to be added to an individual object
 */
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
