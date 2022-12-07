package algorithm.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CountDuplicate {
    public static void main(String args[]) {
        /*List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("" + countDuplicate(numbers));*/
        String input = "abcdeabcdf";
        String output = nonRepeatingCharacter(input);
        System.out.println(output);

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

    public static String nonRepeatingCharacter(String input){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (hashMap.containsKey(input.charAt(i))) {
                hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)) + 1);
            } else {
                hashMap.put(input.charAt(i), 1);
            }
        }

        for (Character key : hashMap.keySet()) {
            Integer value = (Integer) hashMap.get(key);
            if(value == 1){
                return String.valueOf(key);
            }
        }
        return null;
    }
}
