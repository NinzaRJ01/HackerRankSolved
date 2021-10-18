import java.util.*;
import 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            // System.out.println(i);
            if(numMap.containsKey(target-nums[i])){
                int key = numMap.get(target-nums[i]);
                if(key==i)continue;
                int[] temp = {i,key};
                return temp;
            }
        }
        return new int[2];
    }
}