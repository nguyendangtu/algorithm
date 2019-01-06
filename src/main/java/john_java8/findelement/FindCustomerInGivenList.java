package john_java8.findelement;

import com.google.common.collect.Iterables;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindCustomerInGivenList {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "John"),
                new Customer(2, "Tojie"),
                new Customer(3, "Nick")
        );
        Customer customer = FindCustomerInGivenList.findUsingGivenIndex(0, customers);
        //
        if (customer != null) {
            System.out.println("id=" + customer.getId() + " and Name=" + customer.getName());
            System.out.println("index = " + FindCustomerInGivenList.findUsingIndexOf(customer, customers));
        }

        //find using iterators
        Customer customer1 = FindCustomerInGivenList.findUsingIterator("Nick", customers);
        if (customer1 != null) {
            System.out.println("ID=" + customer1.getId() + " and Name=" + customer1.getName());
        }

        //find using loop
        Customer customer2 = FindCustomerInGivenList.findUsingEnhanceForLoop("Nick", customers);
        if (customer2 != null) {
            System.out.println("ID=" + customer2.getId() + " and Name=" + customer2.getName());
        }

        //find using stream
        Customer customer3 = FindCustomerInGivenList.findUsingStream("Nick", customers);
        if (customer3 != null) {
            System.out.println("ID=" + customer3.getId() + " and Name=" + customer3.getName());
        }

        //find using parallel stream
        Customer customer4 = FindCustomerInGivenList.findUsingParallelStream("Nick", customers);
        if (customer4 != null) {
            System.out.println("ID=" + customer4.getId() + " and Name=" + customer4.getName());
        }

        //find using guava
        Customer customer5 = FindCustomerInGivenList.findUsingGuava("Nick", customers);
        if (customer5 != null) {
            System.out.println("ID=" + customer5.getId() + " and Name=" + customer5.getName());
        }

        //find using apache common
        Customer customer6 = FindCustomerInGivenList.findUsingApacheCommon("Nick", customers);
        if (customer6 != null) {
            System.out.println("ID=" + customer6.getId() + " and Name=" + customer6.getName());
        }

    }

    public static Customer findUsingGivenIndex(int indexOfCustomer, List<Customer> customerList) {
        if (indexOfCustomer >= 0 && indexOfCustomer < customerList.size()) {
            return customerList.get(indexOfCustomer);

        }
        return null;
    }

    public static int findUsingIndexOf(Customer customer, List<Customer> customers) {
        return customers.indexOf(customer);
    }

    public static Customer findUsingIterator(String name, List<Customer> customers) {
        Iterator<Customer> customers1 = customers.iterator();
        while (customers1.hasNext()) {
            Customer customer = customers1.next();
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public static Customer findUsingEnhanceForLoop(String name, List<Customer> customers) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public static Customer findUsingStream(String name, List<Customer> customers) {
        return customers.stream().filter(i -> i.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static Customer findUsingParallelStream(String name, List<Customer> customers) {
        return customers.parallelStream().filter(i -> i.getName().equalsIgnoreCase(name)).findAny().orElse(null);
    }

    public static Customer findUsingGuava(String name, List<Customer> customers) {
        return Iterables.tryFind(customers, new com.google.common.base.Predicate<Customer>() {
            public boolean apply(Customer customer) {
                return customer.getName().equalsIgnoreCase(name);
            }
        }).orNull();
    }

    public static Customer findUsingApacheCommon(String name, List<Customer> customers) {
        return IterableUtils.find(customers, new Predicate<Customer>() {
            @Override
            public boolean evaluate(Customer object) {
                return object.getName().equalsIgnoreCase(name);
            }
        });
    }

}
