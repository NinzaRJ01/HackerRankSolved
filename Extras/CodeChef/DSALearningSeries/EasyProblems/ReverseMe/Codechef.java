/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem: ReverseMe;
//Problem Code : REVMEE
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++){
		    A[i]=sc.nextInt();
		}
		System.out.print(A[n-1]);
		for(int i=n-2;i>=0;i--){
		    System.out.print(" "+A[i]);
		}
		
	}
}

