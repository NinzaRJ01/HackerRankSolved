/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code:CHEFFAV 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;//num of testcases
		t = Integer.parseInt(br.readLine());
		while(t!=0){
		    br.readLine();
		    String s = br.readLine();
		    int firstIndexOfCode = s.indexOf("code");
		    int firstIndexOfChef = s.indexOf("chef");
		    if(firstIndexOfChef>firstIndexOfCode)System.out.println("AC");
		    else System.out.println("WA");
		    t--;
		}
	}

}

