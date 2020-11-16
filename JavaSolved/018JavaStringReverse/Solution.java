import java.io.*;
import java.util.*;
/*

A palindrome is a word, phrase, number, or other sequence of
 characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise. 
*/
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for(int i=A.length()-1;i>=0;i--){
            B +=  A.charAt(i);
        }
        // System.out.println(B);
        if(A.equals(B))System.out.println("Yes");
        else System.out.println("No");
    }
}




