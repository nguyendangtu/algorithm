package algorithm.companies.freddiemacclient;

import java.util.HashMap;
import java.util.Objects;

/**
 * I. This class is an example how implement hashCode and Equal method. HashMap contains an array of Node and Node can be can represent
 *     as class following objects. 1. hash (int), 2. Key (K), 3. Value (V), 4. Node next.
 * II. When we put a value to a hash map, hashCode function will get the hash code value of object and put the object to a node.
 *      all item the same hash will store on a linked set. In case of Collision, we will put the object the same hash code on the same set.
 *      If value the same, the object will be overridden, If value is difference, hash map will add the new object after existing object into the set.
 *     When we get a value from a hash map, HashMap will find the linked set base on the hash code of the key, they will compare with the first object
 *       in the set, if not equal, we will compare to the next item and continue util HashMap find out an object into the linked set.
 * III. If we override hashcode, we can find the value when we create a new instance with the same input on constructor.
 *      If we not override hash code, we can not find the value when we create a new instance with the same input on constructor because two new instance will be
 *        difference on the hash code value.
 */
public class EqualAndHashCode {
    public static void main(String args[]) {
        HashMap<Employee, Employee> map = new HashMap<Employee, Employee>();
        Employee e1 = new Employee("John", 36);
        Employee e2 = new Employee("John", 36);
        map.put(e1, e1);

        Employee e3 = map.get(e1);
        System.out.println(e3.getName());

        //before override equal and hashcode, e4 will be null
        Employee e4 = map.get(e2);
        System.out.println(e4.getName());

        //after override equal and hashcode, e4 will be not null

        //Orders

    }
}

class Employee {
    private String name;
    private Integer old;

    public Employee(String name, Integer old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && old.equals(employee.old);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old);
    }
}
