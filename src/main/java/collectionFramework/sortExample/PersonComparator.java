package collectionFramework.sortExample;

import java.util.*;

public class PersonComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Person && o2 instanceof Person) {
            return ((Person) o1).getAge() > ((Person) o2).getAge() ? 1 : -1;
        }
        return -1;
    }

    public static void main(String args[]) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 30));
        personList.add(new Person("Diep", 10));
        personList.add(new Person("Giap", 4));
        personList.add(new Person("Tony", 2));
        Collections.sort(personList, new PersonComparator());
        personList.forEach(i -> System.out.println("Name:" + i.getName() + " -- Age:" + i.getAge()));

    }
}
