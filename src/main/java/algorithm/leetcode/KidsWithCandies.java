package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : JOHNNGUYEN
 * @since : 9/12/2023, Tue
 **/
public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies = new int[]{2,3,4,1,0};
        System.out.println(kidsWithCandies(candies, 3));
        //System.out.println(Arrays.stream(new Character[]{'a','b'}).map(String::valueOf).collect(Collectors.joining()));
        System.out.println("Start:" + "  hello world  ".trim() + ":end");
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList();
        for(int i=0;i<candies.length;i++){
            result.add((candies[i] + extraCandies) >= max);
        }

        return result;
    }

}
