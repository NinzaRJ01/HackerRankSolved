import java.util.Scanner;
/*
Input Format

The first line contains a s string denoting
.
The second line contains an integer k denoting .
Output :
	Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
*/
public class Solution {
    static String[] bsort(String[] A,int n){
        if(n==0)return A;
        for(int i=0;i<n-1;i++){
            if(A[i].compareTo(A[i+1])>0){String tmp =A[i];
                                        A[i]= A[i+1];
                                        A[i+1]=tmp;
                                        }
        }
        return bsort(A,n-1);
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n= s.length() - (k-1);
        String[] myList = new String[n];
        for(int i=0;i<n;i++){
            myList[i]=s.substring(i,i+k);
        }
        myList = bsort(myList,n);
        // for(int i=0;i<n;i++){
        //     System.out.println(myList[i]);
        // }
        
        smallest = myList[0];
        largest = myList[n-1];
        return smallest + "\n" + largest;
    }


