/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code :PIZZA_BURGER
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n--!=0){
		    int[] xyz = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		  //Here 
		  // xyz[0] -- money haresh have
		  // xyz[1] -- cost of pizza 
		  // xyz[2] -- cost of burger 
		  String res = "NOTHING";
		  if(xyz[1]<=xyz[0])res = "PIZZA";
		  else if(xyz[2]<=xyz[0])res = "BURGER";
		  System.out.println(res);
		}
		
	}
}

