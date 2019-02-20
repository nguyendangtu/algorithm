package algorithm.HackerRank.dbsHackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountDuplicate {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("" + countDuplicate(numbers));

    }

    public static int countDuplicate(List<Integer> numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (hashMap.containsKey(numbers.get(i))) {
                hashMap.put(numbers.get(i), hashMap.get(numbers.get(i)) + 1);
            } else {
                hashMap.put(numbers.get(i), 1);
            }
        }

        int[] count = new int[1];
        hashMap.forEach((k, v) -> {
            if (v > 1) {
                count[0]++;
            }
        });
        return count[0];
    }
}
