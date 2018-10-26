package DesignPattern.structural.composite;

public class MainComposite {
    public static void main(String args[]) {
        Employee CEO = new Employee("1", "John");
        Employee CTO = new Employee("2", "Nick");
        CEO.addSubordinate(CTO);
        Employee staff1 = new Employee("3", "TOM");
        Employee staff2 = new Employee("3.1", "Jerry");
        Employee staff3 = new Employee("33.3", "Kay");
        CTO.addSubordinate(staff1);
        CTO.addSubordinate(staff2);
        CTO.addSubordinate(staff3);
        System.out.println(CEO.toString());
    }
}
