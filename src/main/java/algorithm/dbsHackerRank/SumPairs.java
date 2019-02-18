package algorithm.dbsHackerRank;

import java.util.*;

public class SumPairs {

    public static void main(String[] args) {
        System.out.println(sumPairs(Arrays.asList(1, 1, 9, 2, 3, 4, 5, 6, 7, 8, 9), 10));
    }

    public static int sumPairs(List<Integer> a, long k) {
        HashSet<Long> set = new HashSet();
        int count = 0;

        long middle = -1;
        int middleCount = 0;
        if (k % 2 == 0) {
            middle = k / 2;
        }

        HashSet<Long> numSet = new HashSet();
        for (int i = 0; i < a.size(); i++) {
            numSet.add(a.get(i).longValue());
            if (a.get(i).longValue() == middle) {
                middleCount++;
            }
        }

        for (Long integer : numSet) {
            long complement = k - integer;
            if (set.contains(complement)) {
                System.out.println(integer + "," + complement);
                count++;
            } else {
                set.add(integer);
            }
        }

        return middleCount > 1 ? count + 1 : count;

    }



}
