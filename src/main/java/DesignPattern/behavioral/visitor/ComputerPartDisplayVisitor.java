package DesignPattern.behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Visit Computer");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visit monitor");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Visit keyBoard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visit mouse");
    }
}
