/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code : SUBMEX
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int[] inputs = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    int n = inputs[0];
		    int k = inputs[1];
		    int x = inputs[2];//mex needed
		    if(x>k||x==0){//edge cases
		        System.out.println(-1);
		        continue;
		    }
		    System.out.print(0);
		    int count=0;
		    for(int i=1;i<n;i++){
		        count++;
		        if(count==x)count=0;
		        System.out.print(" "+count);
		    }
		    System.out.println();
		}
	}
}

