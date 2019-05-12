package algorithm.HackerRank;

import java.util.HashMap;

public class ArrayMissing {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 5, 4, 3, 6, 7, 15, 9, 10, 11, 0, 0, 0, 14};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(i) == null) {
                System.out.println(i);
            }
        }
    }


}
