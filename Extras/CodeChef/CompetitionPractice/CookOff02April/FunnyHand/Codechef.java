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
		        new InputStreamReader( System.in )
		    );
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t--!=0){
	        int a[]  = Arrays.stream(
	                (br.readLine()).split(" ")
	            ).mapToInt(n->Integer.parseInt(n)).toArray();
	            
	       /*
	        a[0] == n;
	        a[1] == A;
	        a[2] == B;
	       */
	       int res = 0;
	        if(a[1]+1==a[2]||a[2]+1==a[1]){//consecutive
	        
	            if(Math.min(a[1],a[2])==1){
	                res = 1;
	            }else if(Math.max(a[1],a[2])==a[0])res =1;
	            else {
	                res = 2;
	            }
	        }else if(Math.min(a[1],a[2])+2==Math.max(a[1],a[2])){
	            res = 1;
	        }
	        System.out.println(res);
	    }
	}
}

