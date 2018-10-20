package DesignPattern.behavioral.visitor;

import java.util.Arrays;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Monitor(), new Mouse(), new KeyBoard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        Arrays.stream(parts).forEach(p -> p.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
}
