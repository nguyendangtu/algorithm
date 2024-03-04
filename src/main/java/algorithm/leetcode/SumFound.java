package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 5/29/2023, Mon
 * Given a list L = [s0, s1, . . ., sn?1] of n distinct positive integers and a non-negative
 * integer k, determine whether there is a subset of arr the sum of whose values is k. Do this by
 * implementing the following Java method.
 * <p>
 * Hint. Use a solution to Problem 6 as part of your solution to this problem. A solution in the
 * form of a jar file is provided for you so that you can try using it here even if you do not have
 * your own solution to Problem 6.
 * Also, solve the problem when L is allowed to have duplicates. For instance, if L = [4, 5, 3, 8, 3]
 * and k = 6, your Java method should return true since 3 + 3 = 6 and there are two occurrences of
 * 3 in L (however, if L = [4, 5, 3, 8], the Java method should return false since the single occurrence
 * of 3 in L in this case cannot be counted twice).
 **/
public class SumFound {
    public static void main(String[] args) {
        System.out.println(sumFound(Arrays.asList(1, 3, 9, 4, 8, 5), 21));
        System.out.println(sumFound(Arrays.asList(1, 3, 9, 4, 8, 5), 22));
        System.out.println(sumFound(Arrays.asList(1, 3, 9, 4, 8, 5), 31));
        System.out.println(sumFound(Arrays.asList(1, 3, 9, 4, 8, 5), 0));
        System.out.println(sumFound(Arrays.asList(4, 5, 3, 8, 3), 6));
    }

    public static boolean sumFound(List list, int k) {
        if (list == null || list.isEmpty() || k == 0) return false;
        List<List<Integer>> powerList = new ArrayList<>();
        List<Integer> powerSet = new ArrayList<>();
        return backTrack(powerList, powerSet, 0, list, k);
    }

    public static boolean backTrack(List<List<Integer>> powerList, List<Integer> powerSet, int index, List<Integer> list, int sum) {
        if (sum < 0) return false;
        if (sum == 0) return true;
        for (int i = index; i < list.size(); i++) {
            powerSet.add(list.get(i));
            if (backTrack(powerList, powerSet, i + 1, list, sum - list.get(i))) return true;
            powerSet.remove(powerSet.size() - 1);
        }
        return false;
    }
}
