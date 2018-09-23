package DesignPattern.factory;

public class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    public static Shape getShape(String title) {
        Shape shape = null;
        switch (title) {
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            default:
                break;
        }
        return shape;
    }
}
