/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code : POLIN
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    Map<Long,Integer> mmapX = new HashMap<>();
		    Map<Long,Integer> mmapY = new HashMap<>();
		    long count = 0l;
		    for(int i=0;i<n;i++){
		        long[] in = Arrays.stream(
		                (br.readLine()).split(" ")
		            ).mapToLong(num->Long.parseLong(num)).toArray();
		        long x = in[0];
		        long y = in[1];
		        if(!mmapX.containsKey(x))count++;
		        if(!mmapY.containsKey(y))count++;
		        mmapX.put(x,1);
		        mmapY.put(y,1);
		    }
		    System.out.println(count);
		}
	}
}

