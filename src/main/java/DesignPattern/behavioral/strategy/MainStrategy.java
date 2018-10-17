package DesignPattern.behavioral.strategy;

public class MainStrategy {
    public static void main(String args[]) {
        //Context context = new Context()
        AddOperation addOperation = new AddOperation();
        SubstractOperation substractOperation = new SubstractOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        DevideOperation devideOperation = new DevideOperation();

        Context add = new Context(addOperation);
        System.out.println("1+2=" + add.executeOperation(1, 2));
        Context sub = new Context(substractOperation);
        System.out.println("1-2=" + sub.executeOperation(1, 2));
        Context mul = new Context(multiplyOperation);
        System.out.println("1*2=" + mul.executeOperation(1, 2));
        Context dev = new Context(devideOperation);
        System.out.println("1/2=" + dev.executeOperation(1, 2));
    }

}
