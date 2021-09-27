//Time Complexity -> O(n)
//Space Complexity ->O(distinct characters) -256 constant mostly
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> mmap = new HashMap<>();
       // Sliding Windows method :
        int l = s.length();//so it won;t call the function again and again
        int max = 0;int curtl = 0;//will hold current length
        int prev=0;
        //"pwwkew"
        // "tmmzuxt" --> solution void the value having index less then prev
        for(int i=0;i<l;i++){
            
            if(mmap.containsKey(s.charAt(i))){
                if(prev<=mmap.get(s.charAt(i))){
                    curtl=i-mmap.get(s.charAt(i));
                    prev=mmap.get(s.charAt(i));
                    mmap.put(s.charAt(i),i);
                    
                    // curtl++;
                    continue;
                }
            } mmap.put(s.charAt(i),i);
            // System.out.println("s.charAt: "+s.charAt(i)+" "+i+" "+prev);
            curtl++;
            if(max<curtl)max=curtl;
        }
        return max;
    }
}

