package DesignPattern.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interPreter(String context) {
        return context.contains(data);
    }
}
