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
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = (br.readLine()).split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++)arr[i]=Integer.parseInt(str[i]);
        // Result.quickSort(arr,0,n-1);
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int[] diffArray = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            int dif = arr[i+1]-arr[i];
            diffArray[i]=dif>=0?dif:-1*dif;
        }
        int smallestDiff = Integer.MAX_VALUE;
        for(int i=0;i<diffArray.length;i++){
            if(diffArray[i]<smallestDiff)   smallestDiff=diffArray[i];
        }
        String result ="";
        for(int i=0;i<diffArray.length;i++){
            if(diffArray[i]==smallestDiff||diffArray[i]==(-1*smallestDiff)){
                result+=arr[i]+ " "+arr[i+1]+" ";
            }
        }
        System.out.println(result);
        
        
    }
}

