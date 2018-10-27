package DesignPattern.structural.decorator;

public class RedDecoratorShape extends DecoratorShape {

    public RedDecoratorShape(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        this.setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Border is Red");
    }
}
