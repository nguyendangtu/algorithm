package john_java8.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1);
        Optional<Integer> secondSmallest = secondSmallest(list);
        secondSmallest.ifPresent(s-> System.out.println(s.intValue()));
    }

    public static <T extends Comparable<? super T>> Optional<T> secondSmallest(List<T> list) {
        if (list == null || list.size() <= 1) return Optional.empty();
        return list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst();
    }

    public static <T extends Comparable<? super T>> Optional<T> secondSmallest1(List<T> list) {
        if (list == null || list.size() <= 1) return Optional.empty();
        T min = list.get(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
                index = i;
            }
        }


        T secondSmallest = index == 0 ? list.get(1) : list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (secondSmallest.compareTo(list.get(i)) > 0 && i != index) {
                secondSmallest = list.get(i);
            }
        }

        return Optional.of(secondSmallest);
    }


}
