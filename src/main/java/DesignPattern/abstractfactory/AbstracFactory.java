package DesignPattern.abstractfactory;

public abstract class AbstracFactory {
    abstract Shape getShape(String title);
    abstract Color getColor(String title);
}
