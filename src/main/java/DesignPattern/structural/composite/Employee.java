package DesignPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String id;
    private List<Employee> subordinates;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        this.subordinates.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toStringSubordinates() {
        String result = "";
        for (int i = 0; i < subordinates.size(); i++) {
            Employee employee = subordinates.get(i);
            result += employee;
            if (i != subordinates.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return subordinates.size() > 0 ? name + ": [ " + toStringSubordinates() + " ] " : name;
    }
}
