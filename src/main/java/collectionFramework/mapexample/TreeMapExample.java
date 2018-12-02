package collectionFramework.mapexample;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {
    public static void main(String args[]) {
        letDoTreeMap();
        letDoTreeSet();
        System.out.println("HASH SET");
        letDoHashSet();
    }

    public static void letDoTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(3, "Three");
        treeMap.put(2, "two");
        treeMap.put(100, "One hundred");
        treeMap.put(50, "Fifty");
        treeMap.forEach((k, v) -> System.out.println("key=" + k + ",value=" + v));
    }

    public static void letDoTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(100);
        treeSet.add(50);
        treeSet.forEach(System.out::println);
    }

    public static void letDoHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(100);
        hashSet.add(50);
        hashSet.forEach(System.out::println);
    }
}
