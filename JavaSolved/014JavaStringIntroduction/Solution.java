import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
        int comp = A.compareTo(B);
        if(comp>0){System.out.println("Yes");}
        else System.out.println("No");
        char[] arrayOfA= A.toCharArray();
        char[] arrayOfB= B.toCharArray();
        
        arrayOfA[0] = Character.toUpperCase(arrayOfA[0]);
        arrayOfB[0] = Character.toUpperCase(arrayOfB[0]);
        A = String.valueOf(arrayOfA);
        B = String.valueOf(arrayOfB); 
        System.out.println(A+" "+B);
    }
}




