package DesignPattern.behavioral.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
