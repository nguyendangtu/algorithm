package algorithm.companies.resolvtech;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author : JOHNNGUYEN
 * @since : 8/26/2023, Sat
 **/
public class Solution {
    public static int[] parentNodes(int N, int[][] coordinates) {
        LinkedList<Integer> childQueue = new LinkedList<>();
        Set<Integer> parents = new LinkedHashSet<>();
        childQueue.add(1);
        parents.add(-1);
        while (!childQueue.isEmpty()) {
            Integer parent = childQueue.poll();
            for (int[] v : coordinates) {
                if (v[0] == parent) {
                    parents.add(v[0]);
                    childQueue.add(v[1]);
                }
            }
        }
        int[] result = new int[parents.size()];
        int i = 0;
        for (Integer p : parents) {
            result[i++] = p;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] coordinates = {
                {1, 12},
                {1, 8},
                {1, 4},
                {12, 3},
                {4, 6},
                {3, 5},
        };
        int[] result = parentNodes(7, coordinates);
        System.out.println(Arrays.toString(result));
    }
}
