/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    private static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(
		        System.in
		    ));
		    int t = Integer.parseInt(br.readLine());
		  //  int end = (int)Math.pow(10,9);
		    while(t--!=0){
		        int[] a = Arrays.stream(
		                (br.readLine()).split(" ")
		            ).mapToInt(n->Integer.parseInt(n)).toArray();
		        /*
		            a[0] -> A 
		            a[1] -> B
		        */
		       int x=-1;
		       int y=-1;
		        if(a[0]%2==0){
		            x=a[0];
		            if(gcd(a[0]+1,a[0])==1)
		                y=a[0]+2;
		            else 
		                y=a[0]+1;
		        }
		        else{
		            for(int i=a[0]+1;i<a[0]+4;i++){
		                if(gcd(i,a[0])>1){
		                    x = a[0];
		                    y = i;
		                    break;
		                }
		            }
		            if(x==-1&&y==-1){
		                
		                x=a[0]+1;
		                if(gcd(x+1,x)==1)
		                    y=x+2;
		                else 
		                    y=x+1;
		            }
		        }
		        if(x==-1 || x<a[0] || x>a[1] || y>a[1] || y == -1)System.out.println(-1);
		        else System.out.println(x+" "+y);
		        
		    }
	}
}

