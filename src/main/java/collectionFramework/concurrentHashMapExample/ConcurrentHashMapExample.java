package collectionFramework.concurrentHashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

public class ConcurrentHashMapExample {
    public static void main(String args[]) {
        int n = 10000;
        System.out.println("1<<30=" + (1 << 30) + ", and 8>>> 1=" + (n >>> 10));
        hashMapVsConcurrentHashmap();
    }

    public static void hashMapVsConcurrentHashmap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1", "1");
        concurrentHashMap.put("2", "1");
        concurrentHashMap.put("3", "1");
        concurrentHashMap.put("4", "1");
        concurrentHashMap.put("5", "1");
        concurrentHashMap.put("6", "1");
        System.out.println("Before Iterator " + concurrentHashMap);
        BiConsumer<String, String> biConsumer = (k, v) -> System.out.println("key=" + k + ",value=" + v);
        concurrentHashMap.forEach(biConsumer);
        Iterator<String> stringIterator = concurrentHashMap.keySet().iterator();
        while (stringIterator.hasNext()) {
            String key = stringIterator.next();
            if (key.equalsIgnoreCase("3")) {
                concurrentHashMap.put(key + "new", "new3");
            }
            concurrentHashMap.remove(key);
        }
        System.out.println("After Iterator " + concurrentHashMap);

        HashMap hashMap = new HashMap();
        hashMap.put("1", "1");
        hashMap.put("2", "1");
        hashMap.put("3", "1");
        hashMap.put("4", "1");
        hashMap.put("5", "1");
        hashMap.put("6", "1");
        System.out.println("Hashmap Before Iterator " + hashMap);
        hashMap.forEach(biConsumer);
        Iterator<String> iterator = hashMap.keySet().iterator();
       /* while (iterator.hasNext()) {
            String key = iterator.next();
            if (key.equalsIgnoreCase("3")) {
                hashMap.put(key + "new", "new3");
            }
        }*/
        //Print out exception
        hashMap.forEach((k, v) -> {
            if ("3".equalsIgnoreCase((String) k)) {
                hashMap.put("new" + k, "new" + v);
            }
        });
        System.out.println("Hashmap After Iterator " + hashMap);

    }
}
