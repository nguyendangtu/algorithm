package collectionFramework.sortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameComparable implements Comparable {
    private String name;
    private int ranking;

    public NameComparable(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof NameComparable) {
            NameComparable nameComparable = (NameComparable) o;
            return this.ranking >= nameComparable.ranking ? 1 : -1;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public static void main(String args[]) {
        List<NameComparable> nameComperableList = new ArrayList<>();
        nameComperableList.add(new NameComparable(3));
        nameComperableList.add(new NameComparable(1));
        nameComperableList.add(new NameComparable(4));
        nameComperableList.add(new NameComparable(2));
        Collections.sort(nameComperableList);
        nameComperableList.forEach(i -> System.out.println(i.getRanking()));
    }
}
