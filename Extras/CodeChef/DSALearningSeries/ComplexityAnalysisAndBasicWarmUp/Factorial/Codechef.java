/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem : Factorial
//Problem Code : FCTRL
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());//number of test 
		while(t--!=0){
		    long num = Long.parseLong(br.readLine());//input number 
		    long numberOftrailingZeros = 0l;
		    while(num!=0){
		        num/=5;
		        numberOftrailingZeros+=num;
		    }
		    System.out.println(numberOftrailingZeros);
		}
		
	}
}

