package algorithm.leetcode;

import java.util.*;

/**
 * input: A list L of objects without duplicates
 * output: A list P of subsets of L, without duplicates.
 *
 * @author : JOHNNGUYEN
 * @since : 8/5/2023, Sat
 **/
public class PowerSet {
    public static void main(String[] args) {
        System.out.println(powerSet(Arrays.asList(1)));
        System.out.println(powerSet(Arrays.asList(1, 2)));
        System.out.println(powerSet(Arrays.asList(1, 2, 3)));

        System.out.println(subsetSum(Arrays.asList(5, 2, 3, 4), 14));
    }

    public static boolean subsetSum(List<Integer> list, int sum) {
        if (null == list || list.isEmpty()) {
            return false;
        }
        return backTrack(sum, new ArrayList<>(), 0, list);
    }

    public static List<List<Integer>> powerSet(List<Integer> list) {
        List<List<Integer>> powerList = new ArrayList<>();
        List<Integer> powerSet = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            powerList.add(powerSet);
            return powerList;
        }
        backTrack(powerList, powerSet, 0, list);
        return powerList;
    }

    public static void backTrack(List<List<Integer>> powerList, List<Integer> powerSet, int index, List<Integer> list) {
        if (index > list.size()) {
            return;
        }
        powerList.add(new ArrayList<>(powerSet));
        for (int i = index; i < list.size(); i++) {
            powerSet.add(list.get(i));
            backTrack(powerList, powerSet, i + 1, list);
            powerSet.remove(powerSet.size() - 1);
        }
    }

    public static boolean backTrack(int sum, List<Integer> powerSet, int index, List<Integer> list) {
        if (index > list.size() || sum <= 0) {
            if (sum == 0) {
                return true;
            }
        }
        boolean result = false;
        for (int i = index; i < list.size(); i++) {
            sum -= list.get(i);
            powerSet.add(list.get(i));
            result = backTrack(sum, powerSet, i + 1, list);
            if(result == true){ return true;}
            sum += powerSet.get(powerSet.size() - 1);
            powerSet.remove(powerSet.size() - 1);
        }
        return result;
    }
}
