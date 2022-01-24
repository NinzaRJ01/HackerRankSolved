/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code - NOPAL
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    char ch = 'a';
		    while(n--!=0){
		        if(ch=='z'+1)ch='a';
		        System.out.print(ch++);
		    }
		    System.out.println();
		}
	}
}

