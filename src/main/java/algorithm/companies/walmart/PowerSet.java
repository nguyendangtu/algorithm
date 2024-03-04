package algorithm.companies.walmart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 9/1/2023, Fri
 **/
public class PowerSet {
    public static void main(String[] args) {
        System.out.println(powerSets(new int[]{1, 2, 3}));
        int[][] result = convertListToArray(powerSets(new int[]{1, 2, 3}));
        System.out.println(result);

    }

    public static List<List<Integer>> powerSets(int[] a) {

        List<List<Integer>> powerList = new ArrayList<>();
        List<Integer> powerSet = new ArrayList<>();
        if (a == null || a.length == 0) {
            return powerList;
        }
        powerSet(powerList, powerSet, a, 0);

        return powerList;
    }

    public static void powerSet(List<List<Integer>> powerList, List<Integer> powerSet, int[] a, int index) {
        //base case
        if (index > a.length) {
            return;
        }

        powerList.add(new ArrayList<>(powerSet));
        for (int i = index; i < a.length; i++) {
            powerSet.add(a[i]);
            powerSet(powerList, powerSet, a, i + 1);
            powerSet.remove(powerSet.get(powerSet.size() - 1));
        }

    }

    public static int[][] convertListToArray(List<List<Integer>> lists) {
        int maxSize = lists.stream().mapToInt(i -> i.size()).max().getAsInt();
        int result[][] = new int[lists.size()][maxSize];
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            for (int j = 0; j < list.size(); j++) {
                result[i][j] = list.get(j);
            }
        }
        return result;
    }
}
