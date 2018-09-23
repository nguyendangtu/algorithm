package DesignPattern.creational.abstractfactory;

import static DesignPattern.creational.abstractfactory.FactoryB.BLUE;
import static DesignPattern.creational.abstractfactory.FactoryB.GREEN;
import static DesignPattern.creational.abstractfactory.FactoryB.RED;

public class FactoryA extends AbstracFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    @Override
    public Color getColor(String title) {
        Color color = null;
        switch (title) {
            case RED:
                color = new Red();
                break;
            case GREEN:
                color = new Green();
                break;
            case BLUE:
                color = new Blue();
                break;
            default:
                break;
        }
        return color;
    }

    @Override
    public Shape getShape(String title) {
        Shape shape = null;
        switch (title) {
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case CIRCLE:
                shape = new Circle(1);
                break;
            default:
                break;
        }
        return shape;
    }
}
