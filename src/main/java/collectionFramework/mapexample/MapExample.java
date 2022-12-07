package collectionFramework.mapexample;

import java.util.*;

public class MapExample {
    public static void main(String args[]) {
        letDoLinkedHashMap();
        letDoHashMap();
        letDoHashTable();
    }

    public static void letDoLinkedHashMap() {
        Cat c1 = new Cat("Red");
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown");
        Cat c4 = new Cat("White");
        LinkedHashMap<Cat, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c1, 10);
        linkedHashMap.put(c2, 15);
        linkedHashMap.put(c3, 5);
        linkedHashMap.put(c4, 20);
        System.out.println(linkedHashMap);


    }

    public static void letDoHashMap() {
        System.out.println("LET DO HASH MAP");
        Cat c1 = new Cat("Red");
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown");
        Cat c4 = new Cat("White");
        HashMap<Cat, Integer> hashMap = new HashMap<>();
        hashMap.put(c1, 10);
        hashMap.put(c2, 15);
        hashMap.put(c3, 5);
        hashMap.put(c4, 20);

        // linkedHashMap.forEach((k, v) -> System.out.println("color=" + k.getColor()));
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }

        System.out.println("HASHMAP");
        HashMap hashMap1 = new HashMap();
        hashMap1.put("1", null);
        hashMap1.put("1", "1");
        hashMap1.put("1", "2");
        hashMap1.put("3", "3");
        hashMap1.put("4", "4");
        hashMap1.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));


    }

    public static void letDoHashTable() {
        System.out.println("HASH TABLE");
        Hashtable hashtable = new Hashtable();
        // hashtable.put(null, null);
        hashtable.put("1", "1");
        hashtable.put("1", "2");
        hashtable.put("3", "3");
        hashtable.put("4", "4");
        hashtable.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

    }
}
