/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem  : Lapindrome
//Problem Link : LAPIN
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());//Number of test cases 
		while(t!=0){
		    char[] s = (br.readLine()).toCharArray();
		    int n = s.length;
		    int[] firstHalf = new int[256];
		    int[] secondHalf = new int[256];
		    for(int i=0;i<n/2;i++){
		        int k = (int)s[i];
		        firstHalf[k]+=1;
		        int j = (n-i)-1;
		        k = (int)s[j];
		        secondHalf[k]+=1;
		    }
		    boolean res = true;
		    for(int i=0;i<256;i++){
		        if(firstHalf[i]!=secondHalf[i])
		            res = false;
		    }
		    System.out.println(res==true?"YES":"NO");
		    t--;
		}
		
	}
}

