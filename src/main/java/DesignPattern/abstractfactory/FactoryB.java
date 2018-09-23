package DesignPattern.abstractfactory;

public class FactoryB extends  AbstracFactory{
    public static final String RED = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";

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
                shape = new Circle(2);
                break;
            default:
                break;
        }
        return shape;
    }
}
