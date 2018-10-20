package DesignPattern.behavioral.visitor;

public class MainVisitor {
    public static void main(String args[]) {
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();
        computer.accept(computerPartVisitor);
    }
}
