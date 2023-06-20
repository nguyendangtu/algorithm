package algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : JOHNNGUYEN
 * @since : 5/3/2023, Wed
 **/
public class SingleNumber {
    public static void main(String[] args) {
        int []  nums = new int [] {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashSet set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(set.contains(nums[i])){
               set.remove(nums[i]);
           }else{
               set.add(nums[i]);
           }
        }
        return (Integer)set.toArray()[0];

    }

    public static int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(null == map.get(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], 2);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
