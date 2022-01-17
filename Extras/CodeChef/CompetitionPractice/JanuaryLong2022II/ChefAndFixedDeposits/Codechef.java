/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : Chef and Fixed Deposits
//Problem Code : MINFD
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int[] nx = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    int[] deposits = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    Arrays.sort(deposits);
		    int l = nx[0];
		    int count = 1;
		    long amt =deposits[l-1];l--;
		    while(amt<nx[1]&&l--!=0){
		        amt+=deposits[l];
		        count++;
		    }
		    if(amt>=nx[1])System.out.println(count);
		    else System.out.println(-1);
		}
	}
}

