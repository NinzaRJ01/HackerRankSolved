/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(
		        new InputStreamReader(System.in)
		    );
		 int t = Integer.parseInt(br.readLine());
		 while(t--!=0){
		     long[] a = Arrays.stream(
		            (br.readLine()).split(" ")
		         ).mapToLong(num->Long.parseLong(num)).toArray();
		  //    
		  //    a[0] -> cost of wc for per month rent
		  //    a[1] -> cost of wc 
		  long res = 0;
		  if(a[0]<a[1]) {
		      double d1 = a[1]/a[0];
		      double d2 = Math.floor(d1);
		      res = (long)d2;
		      if(a[1]%a[0]==0)res-=1;
		  }
		  System.out.println(res);
		 }
	}
}

