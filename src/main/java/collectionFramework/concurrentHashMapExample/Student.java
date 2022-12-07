package collectionFramework.concurrentHashMapExample;

import java.util.concurrent.ConcurrentHashMap;

public class Student {
    private String name;
    private Integer old;

    public Student(String name, Integer old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public static void main(String args[]) {
        ConcurrentHashMap<Student, String> concurrentHashMap = new ConcurrentHashMap<>();
        Student student = new Student("Hung", 50);
        concurrentHashMap.put(student, "test");
        System.out.println("" + concurrentHashMap.get(student));
        Student student1 = new Student("Hung", 50);
        System.out.println("" + concurrentHashMap.get(student1));
    }
}
