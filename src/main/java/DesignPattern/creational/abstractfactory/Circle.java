package DesignPattern.creational.abstractfactory;

public class Circle implements Shape {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Draw a Circle");
    }
}
