/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    static long digitSum(long n){
        String s = n+"";
        long sum = 0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        return sum;
    }
    static int XOR(int a, int b){
        return (a+b)%2;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader  br = new BufferedReader(
		        new InputStreamReader(System.in)
		    );
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    long n = Long.parseLong(br.readLine());
		    if(n%10!=9){
		        System.out.println(++n);
		        continue;
		    }
		    int val1 = ((int)digitSum(n))%2;
		    int val2 = ((int)digitSum(n+1))%2;
		    int val3 = ((int)digitSum(n+2))%2;
		    if(XOR(val1,val2)==1){
		        System.out.println(n+1);
		    }else if(XOR(val1,val3)==1)System.out.println(n+2);
		    
		}
	}
}

