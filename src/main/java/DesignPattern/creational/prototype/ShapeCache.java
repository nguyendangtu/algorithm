package DesignPattern.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeCache = new Hashtable<>();

    public final static Shape getShape(String id) {
        Shape shape = shapeCache.get(id);
        return (Shape) shape.clone();
    }

    public static final void loadShapes() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(), circle);

        Retangle retangle = new Retangle();
        retangle.setId("2");
        shapeCache.put(retangle.getId(), retangle);

        Square square = new Square();
        square.setId("3");
        shapeCache.put(square.getId(), square);
    }
}
