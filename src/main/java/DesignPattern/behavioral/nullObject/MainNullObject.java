package DesignPattern.behavioral.nullObject;

public class MainNullObject {
    public static void main(String args[]) {
        AbstractCustomer c1 = CustomerFactory.getCustomer("John");
        System.out.println("name1 is " + c1.getName());

        AbstractCustomer c2 = CustomerFactory.getCustomer("Black");
        System.out.println("name2 is " + c2.getName());


    }
}
