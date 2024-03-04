package algorithm.companies.test;

import java.util.*;

/**
 * @author : JOHNNGUYEN
 * @since : 11/15/2023, Wed
 **/
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 2, 5, 1, 2);
        System.out.println(getMinimumFruits(list));
    }

    private static int getMinimumFruits(List<Integer> fruits) {
        if (null == fruits || fruits.size() == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        fruits.forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        heap.addAll(map.values());
        while (!heap.isEmpty()) {
            Integer first = heap.poll();
            if (heap.isEmpty()) return first;
            Integer second = heap.poll();
            heap.add(first - second);
        }
        return 0;
    }

/*    private static int getMinimumFruits1(List<Integer> fruits) {
        if (null == fruits || fruits.size() == 0) return 0;
        fruits.sort(Integer::compare);
        int count = 0;
        for (int i = 0; i < fruits.size() - count - 1; i++) {
            if (fruits.get(i) != fruits.get(i + 1)) {
                swap(fruits, i, fruits.size() - 1 - count);
                swap(fruits, i + 1, fruits.size() - count - 2);
                count += 2;
            }
        }
        if (count == 0) {
            return fruits.size();
        } else {
            fruits = fruits.subList(0, fruits.size() - count);
            return getMinimumFruits(fruits);
        }
    }

    private static void swap(List<Integer> fruits, int i, int j) {
        Integer tmp = fruits.get(i);
        fruits.set(i, fruits.get(j));
        fruits.set(j, tmp);
    }*/


}
