package hashCode_Equal;

import java.util.HashMap;

/**
 * I. This class is an example how implement hashCode and Equal method. HashMap contains an array of Node and Node can be can represent
 *     as class following objects. 1. hash (int), 2. Key (K), 3. Value (V), 4. Node next.
 * II. When we put a value to a hash map, hashCode function will get the hash code value of object and put the object to a node.
 *      all item the same hash will store on a linked set. In case of Collision, we will put the object the same hash code on the same set.
 *      If value the same, the object will be override, If value is difference, hash map will add the new object after existing object into the set.
 *     When we get a value from a hash map, HashMap will find the linked set base on the hash code of the key, they will compare with the first object
 *       in the set, if not equal, we will compare to the next item and continue util HashMap find out an object into the linked set.
 * III. If we override hashcode, we can find the value when we create a new instance with the same input on constructor.
 *      If we not override hash code, we can not find the value when we create a new instance with the same input on constructor because two new instance will be
 *        difference on the hash code value.
 */
public class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("Hash Code for key: " + key + " = " + hash);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        return key.equals(((Key) object).key);
    }

    public static void main(String args[]) {
        HashMap<Key, Integer> hashMap = new HashMap<>();
        hashMap.put(new Key("JohnNguyen"), 20);
        hashMap.put(new Key("JohnNguyen1"), 30);
        hashMap.put(new Key("Nick"), 20);
        hashMap.put(new Key("Nick"), 30);
        System.out.println("All value will be null if we new object and not override equal and hashcode:");
        System.out.println("value is " + hashMap.get(new Key("JohnNguyen")));
        System.out.println("value is " + hashMap.get(new Key("JohnNguyen1")));
        System.out.println("value is " + hashMap.get(new Key("Nick")));

        System.out.println("All value will be not null if we not new object and not override equal and hashcode:");
        HashMap<Key, Integer> hashMap1 = new HashMap<>();
        Key key1 = new Key("JohnNguyen");
        Key key2 = new Key("JohnNguyen1");
        Key key3 = new Key("Nick");
        hashMap1.put(key1, 20);
        hashMap1.put(key2, 30);
        hashMap1.put(key3, 20);
        hashMap1.put(key3, 30);
        System.out.println("value is " + hashMap1.get(key1));
        System.out.println("value is " + hashMap1.get(key2));
        System.out.println("value is " + hashMap1.get(key3));
    }

}
