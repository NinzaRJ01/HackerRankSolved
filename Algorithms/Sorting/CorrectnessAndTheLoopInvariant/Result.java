import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            int key = s.nextInt();
            arr[i] = key;
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<n;i++){
            if(i!=n)
                System.out.print(arr[i]+" ");
            else
            System.out.println(arr[i]);
        }
    }
}
