package DesignPattern.behavioral.strategy;

public class DevideOperation implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a / b;
    }
}
