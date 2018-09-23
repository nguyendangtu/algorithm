package DesignPattern.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("This is a Circle::draw() function");
    }
}
