package DesignPattern.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(KeyBoard keyBoard);

    void visit(Mouse mouse);
}
