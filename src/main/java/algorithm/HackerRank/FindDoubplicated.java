package algorithm.HackerRank;

import java.util.HashMap;

/**
 * @author : JOHNNGUYEN
 * @since : 3/29/2023, Wed
 **/
public class FindDoubplicated {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length; i++){
            if(map.get(nums[i])  != null){
                return true;
            }else{
                map.put(nums[i], nums[i]);
            }
        }
        return false;
    }
}
