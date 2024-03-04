package algorithm.companies.g2o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 8/5/2023, Sat
 **/
public class CountWaysToScore {
    public static void main(String[] args) {
        //coins are 2,3,6
        System.out.println(countWaysToScore(6));
        System.out.println(countWaysToScore(5));
    }

    public static int countWaysToScore(int score) {
        int[] candidates = new int[]{2, 3, 6};
        return countWaysToScore(candidates, score);
    }

    public static int countWaysToScore(int[] candidates, int score) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backTrack(new ArrayList<>(), result, candidates, 0, score);
        return result.size();
    }

    public static void backTrack(List<Integer> list, List<List<Integer>> result, int[] candidates, int index, int target) {

        if (target <= 0 || index == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(candidates[index]);
        backTrack(list, result, candidates, index, target - candidates[index]);
        list.remove(list.size() - 1);
        backTrack(list, result, candidates, index + 1, target);
    }

    //Dynamic programming
    public static int countWaysToScoreDP(int score) {
        int[] table = new int[score + 1];
        for (int i = 0; i < table.length; i++) {
            table[i] = 0;
        }

        table[0] = 1;//init value, base case
        for (int i = 2; i <= score; i++) {
            table[i] += table[i - 2];
        }
        for (int i = 3; i <= score; i++) {
            table[i] += table[i - 3];
        }
        for (int i = 6; i <= score; i++) {
            table[i] += table[i - 6];
        }
        return table[score];
    }


}
