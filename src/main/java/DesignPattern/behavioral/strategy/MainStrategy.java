package DesignPattern.behavioral.strategy;

/***
 * the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables
 * selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time
 * instructions as to which in a family of algorithms to use.[1]
 */
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
