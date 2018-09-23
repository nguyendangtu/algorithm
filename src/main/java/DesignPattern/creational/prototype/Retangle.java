package DesignPattern.creational.prototype;

public class Retangle extends Shape {
    public Retangle() {
        type = "Retangle";
    }

    @Override
    void draw() {
        System.out.println("This is the Retangle::draw() method");
    }
}
