package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 5/6/2023, Sat
 **/
public class GroupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = new int[]{3, 3, 3, 3, 3, 1, 3};
        //int[] groupSizes = new int[]{2, 1, 3, 3, 3, 2};
        System.out.println(groupThePeople(groupSizes));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            List<Integer> values = map.get(groupSizes[i]);
            values.add(i);
            if (values.size() == groupSizes[i]) {
                result.add(values);
                map.remove(groupSizes[i]);
            }
        }
        return result;
    }
}
