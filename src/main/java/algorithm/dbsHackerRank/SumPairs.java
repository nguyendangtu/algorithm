package algorithm.dbsHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumPairs {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12));
        long k = 13;
        System.out.println("The number of pair is: " + sumPairs(numbers, k));
    }

    public static int sumPairs(List<Integer> numbers, long k) {
        HashMap<Long, Boolean> hashMap = new HashMap();
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            long complement = k - numbers.get(i);
            if (hashMap.containsKey(complement)) {
                System.out.println(numbers.get(i) + "," + complement);
                count++;
            } else {
                hashMap.put(numbers.get(i).longValue(), true);
            }

        }
        return count;
    }
}
