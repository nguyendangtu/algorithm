package hashCode_Equal;

import java.util.HashMap;

public class Key1 {
    private String key1;

    public Key1(String key1) {
        this.key1 = key1;
    }

    public static void main(String args[]) {
        HashMap<Key1, Integer> hashMap = new HashMap<>();
        hashMap.put(new Key1("JohnNguyen"), 20);
        hashMap.put(new Key1("JohnNguyen1"), 30);
        hashMap.put(new Key1("Nick"), 20);
        hashMap.put(new Key1("Nick"), 30);
        System.out.println("All value will be null if we create new object and not override equal and hashcode:");
        System.out.println("value is " + hashMap.get(new Key1("JohnNguyen")));
        System.out.println("value is " + hashMap.get(new Key1("JohnNguyen1")));
        System.out.println("value is " + hashMap.get(new Key1("Nick")));

        HashMap<Key1, Integer> hashMap1 = new HashMap<>();
        Key1 key11 = new Key1("JohnNguyen");
        Key1 key12 = new Key1("JohnNguyen1");
        Key1 key13 = new Key1("Nick");
        hashMap1.put(key11, 20);
        hashMap1.put(key12, 30);
        hashMap1.put(key13, 20);
        hashMap1.put(key13, 30);
        System.out.println("All value will be not null if we not new object and not override equal and hashcode:");
        System.out.println("value is " + hashMap1.get(key11));
        System.out.println("value is " + hashMap1.get(key12));
        System.out.println("value is " + hashMap1.get(key13));
    }
}
