package DesignPattern.creational.prototype;

public class Retangle extends Shape {
    public Retangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("This is the Rectangle::draw() method");
    }
}
