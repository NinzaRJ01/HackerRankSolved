/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code : MEANMAX
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    long[] arr = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToLong(num->Long.parseLong(num)).toArray();
		    Arrays.sort(arr);
		    long sum =0;
		    for(int i=0;i<n-1;i++)
		        sum+=arr[i];
		    double meanA = (double)sum/(double)(n-1);
		    double meanB = arr[n-1];
		  //  System.out.println(meanA+meanB);
		    System.out.printf("%.6f%n", meanA+meanB);
		}
		
	}
}

