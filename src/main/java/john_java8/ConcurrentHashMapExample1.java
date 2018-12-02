package john_java8;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String args[]) {
        letDoFirstExample();
        letDoSearch();
        letDoCompute();
        letDoMapReduced();
    }

    public static void letDoFirstExample() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A", 1);
        concurrentHashMap.put("B", 2);
        concurrentHashMap.put("C", 3);
        concurrentHashMap.put("D", 4);
        concurrentHashMap.put("E", 5);
        concurrentHashMap.put("F", 6);
        concurrentHashMap.put("G", 7);
        concurrentHashMap.forEach(2, (k, v) -> System.out.println("key=" + k + ",value=" + v + ", by thread=" + Thread.currentThread().getName()));
    }

    public static void letDoSearch() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A", 1);
        concurrentHashMap.put("B", 2);
        concurrentHashMap.put("C", 3);
        concurrentHashMap.put("D", 4);
        concurrentHashMap.put("E", 5);
        concurrentHashMap.put("F", 6);
        concurrentHashMap.put("G", 7);
        String result = concurrentHashMap.search(1, (k, v) -> {
            System.out.println(Thread.currentThread().getName());
            if (k.equalsIgnoreCase("A")) {
                return k + "-" + v;
            }
            return null;
        });
        System.out.println(result);
    }

    public static void letDoCompute() {
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        System.out.println("1st print =>" + map1.compute("A", (k, v) -> k == null ? 42 : v + 40));
        System.out.println("2nd print => " + map1);
        System.out.println("3rd print => " + map1.compute("X",
                (k, v) -> v == null ? 42 : v + 41));
        System.out.println("4nd print => " + map1);


        //computeIfPresent method
        System.out.println("5th print => " + map1.computeIfPresent("X", (k, v) -> v == null ? 42 : v + 10));
        System.out.println("6th print => " + map1);

        //computeIfAbsent method
        System.out.println("7th print => " + map1.computeIfAbsent("Y", (k) -> 90));
        System.out.println("8th print => " + map1);
    }

    public static void letDoMapReduced() {
        ConcurrentHashMap<String, Integer> reducedMap = new ConcurrentHashMap<>();
        reducedMap.put("One", 1);
        reducedMap.put("Two", 2);
        reducedMap.put("Three", 3);
        System.out.println("1st reduce print " +
                reducedMap.reduce(2, (k, v) -> v , (elem, total) -> elem + 2 * total));
        System.out.println("2nd reduce print " + reducedMap);

    }

}
