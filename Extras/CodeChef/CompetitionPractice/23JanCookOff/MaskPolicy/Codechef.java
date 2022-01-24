/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code - MASKPOL
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int[] na = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    //Here 
		    // na[0] -- total number of people in town
		    //na[1]--total infected people in town
		    int remainingPeople = na[0]-na[1];
		    System.out.println(Math.min(na[1],remainingPeople));
		}
		br.close();
	}
}

