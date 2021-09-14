import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        // Note Solution is yet to Complete
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = (br.readLine()).split(" ");
        int[] arr  = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            
            arr[i]=Integer.parseInt(strs[i]);
            map.put(arr[i]/*key*/,i/*value*/);
            
        }
        int[] ascSorted = arr.clone();
        Arrays.sort(ascSorted);//O(nlogn)
        int[] descSorted = ascSorted.clone();
        
        for(int i=0;i<n;i++){
            descSorted[i]=ascSorted[n-i-1];
        }
        Map<Integer,Integer> orginal = new HashMap<>(map);
        int min_swaps =0;
        int tmp_swaps = 0;
        for(int i=0;i<n;i++){
            int tmp = map.get(ascSorted[i]);
            if(tmp!=i){
                
                map.replace(ascSorted[i],i);
                map.replace(ascSorted[i],tmp);
                tmp_swaps++;
            }
        }
        min_swaps = tmp_swaps;
        tmp_swaps=0;
        map  = orginal;
        for(int i=0;i<n;i++){
            int tmp = map.get(descSorted[i]);
            if(tmp!=i){
                
                map.replace(descSorted[i],i);
                map.replace(desc[i],tmp);
                tmp_swaps++;
            }
        }
        
        System.out.println(min_swaps<tmp_swaps?min_swaps:tmp_swaps);
        
        
        
    }
}

