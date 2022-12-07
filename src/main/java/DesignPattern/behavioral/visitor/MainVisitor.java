package DesignPattern.behavioral.visitor;

/***
 * visitor design pattern is a way of separating an algorithm from an object structure on which it operates.
 * A practical result of this separation is the ability to add new operations to existing object structures without
 * modifying the structures
 */
public class MainVisitor {
    public static void main(String args[]) {
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();
        computer.accept(computerPartVisitor);
    }
}
