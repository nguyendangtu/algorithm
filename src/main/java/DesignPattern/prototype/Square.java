package DesignPattern.prototype;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("This is a Square::draw() method");
    }
}