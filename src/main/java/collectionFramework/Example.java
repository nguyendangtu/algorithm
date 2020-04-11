package collectionFramework;

import java.util.*;

public class Example {
    public static void main(String args[]) {


    }

    public static void listExample() {
        //1. What are the two ways to iterate the elements of a collection?
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //1.1: Loop
        System.out.println("1.1 Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //1.2 Loop
        System.out.println("1.1 Loop from 1.6");
        for (String item : list) {
            System.out.println(item);
        }
        //1.3 For each
        System.out.println("1.3 For Each");
        list.forEach(System.out::println);
        //1.4 Iterator
        System.out.println("1.4 Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        //LínkedList
        List<String> list1 = new LinkedList<>();

        //Vector
        List<String> vector = new Vector<>();
    }


    public static void comparableVsComparator() {

    }
}
