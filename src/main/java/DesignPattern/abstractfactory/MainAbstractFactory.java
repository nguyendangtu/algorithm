package DesignPattern.abstractfactory;

public class MainAbstractFactory {
    public static void main(String args[]) {
        AbstracFactory factory = new FactoryB();
        factory.getShape("CIRCLE").draw();
    }

}
