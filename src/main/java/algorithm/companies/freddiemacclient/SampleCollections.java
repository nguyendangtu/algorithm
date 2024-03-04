package algorithm.companies.freddiemacclient;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : JOHNNGUYEN
 * @since : 8/19/2023, Sat
 **/
public class SampleCollections {
    public static void main(String[] args) {
        //ArrayList
      /*  ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 2, 9));
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 4, 2, 9));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 4, 2, 9));
        List<Integer> sort1 = arrayList.stream().sorted().collect(Collectors.toList());
        List<Integer> sort2 = arrayList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        sort1.forEach(System.out::println);
        sort2.forEach(System.out::println);
        Collections.sort(arrayList);//comparable, compareTo
        Collections.sort(arrayList1, Integer::compare);//comparator, compare
        Collections.sort(arrayList2, Comparator.comparing(Integer::intValue).reversed());//comparator
        arrayList.forEach(System.out::println);
        arrayList1.forEach(System.out::println);
        arrayList2.forEach(System.out::println);*/

        //LinkedList
      /*  List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);linkedList.add(10);linkedList.add(2);
        linkedList.sort(Comparator.comparing(Integer::intValue).reversed());
        linkedList.forEach(System.out::println);*/

        //HASHSET
       /* HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ba"); hashSet.add("ab"); hashSet.add("c");// hashSet.add(2);
        hashSet.forEach(System.out::println);*/

        //TREESET
      /*  TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ba"); treeSet.add("ab"); treeSet.add("c");// hashSet.add(2);
        treeSet.forEach(System.out::println);
        System.out.println("ba".compareTo("c"));*/

        //HASHMAP
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(10,3);
        hashMap.put(5, 1);
        hashMap.put(7,4);
        hashMap.forEach((k,v)-> System.out.println(k));

        //TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        treeMap.put(10,1);
        treeMap.put(5,2);
        treeMap.put(7,3);
        treeMap.forEach((k,v) -> System.out.println(k));

        //LinkedHashSet

        //LinkedHashMap
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,3);
        linkedHashMap.put(5, 1);
        linkedHashMap.put(7,4);

        linkedHashMap.forEach((k,v) -> System.out.println(k));

    }
}

class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
