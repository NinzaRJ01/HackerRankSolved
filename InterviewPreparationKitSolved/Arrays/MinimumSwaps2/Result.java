import java.util.*;
//Problem : Minimum Swaps 2 
//Problem Link : https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
class Result{
    static void swap(int[] a,int i){
        int ind = a[i]-1;
        a[i] = a[ind];
        a[ind] = ind+1;
    }
    static int minimumSwaps(int[] arr) {//arr contains elements 1 to arr.length need to be sort , return minimum swaps required for that
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){//cyclic sort
            while(arr[i]!=i+1){
                swap(arr,i);
                count++;
            }
        }
        return count;
    }
}