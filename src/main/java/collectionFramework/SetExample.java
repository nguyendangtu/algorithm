package collectionFramework;

import java.util.*;

public class SetExample {
    public static void main(String args[]) {
        setInterface();
        enumerationVsIterator();
        letDoLinkedHashMap();
    }


    public static void setInterface() {


        System.out.println("HASHSET");
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(8);
        hashSet.forEach(System.out::println);

        System.out.println("HASHSET_1");
        HashSet hashSet1 = new HashSet();
        hashSet1.add("Abhijeet");
        hashSet1.add("Ram");
        hashSet1.add("Kevin");
        hashSet1.add("Singh");
        hashSet1.add("Rick");
        hashSet1.add("Ram");
        hashSet1.forEach(System.out::println);


        System.out.println("TREESET");
        TreeSet treeSet = new TreeSet<>();
        //treeSet.add(null);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(8);
        treeSet.forEach(System.out::println);

        System.out.println("TREESET_1");
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add("Abhijeet");
        treeSet1.add("Ram");
        treeSet1.add("Kevin");
        treeSet1.add("Singh");
        treeSet1.add("Rick");
        treeSet1.add("Ram");
        treeSet1.forEach(System.out::println);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
    }

    public static void enumerationVsIterator() {
        Vector vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");

        System.out.println("Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            iterator.remove();
            System.out.println(item);
        }
        System.out.println("Iterator - 1: " + vector.size());
        vector.forEach(System.out::println);
        System.out.println("Iterator - 2: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    public static void letDoLinkedHashMap() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Three", "Three");
        linkedHashMap.put("Two", "Two");
        linkedHashMap.put("One", "One");
        linkedHashMap.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
