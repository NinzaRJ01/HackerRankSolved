import java.util.*;
class Solution {
    
    public int removeElement(int[] nums, int val) {
        //Brute Force Solution
        // time complexity isn't good 
        //int n =0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==val){
        //         for(int j=i+1;j<nums.length-1;j++)
        //             nums[j-1]=nums[j];
        //         i--;
        //         continue;
        //     }
        //     n++;
                int i=0,j=0;
        while(j<nums.length){
                if(nums[j]!=val){
                    nums[i]=nums[j];
                    i++;
                    
                }
            j++;
            }
            
        
        return i;
    }
}
