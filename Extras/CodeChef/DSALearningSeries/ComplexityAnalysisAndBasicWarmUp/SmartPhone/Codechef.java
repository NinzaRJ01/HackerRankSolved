import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
//Problem : Smart Phone
// Problem Code : ZCO14003
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] a = new long[N];
		for(int i=0;i<N;i++){
		    long val = Long.parseLong(br.readLine());
		    a[i]=val;
		}
		Arrays.sort(a);
// 		System.out.println(Arrays.toString(a));
		//Debug
		BigInteger maxTotal = new BigInteger("-111111111");
		for(int i=0;i<N;i++){
		    BigInteger valAll = (new BigInteger((N-i)+"")).multiply(new BigInteger(a[i]+""));
		  //  System.out.println("val : "+valAll);
		    maxTotal=maxTotal.max(valAll);
		}
		System.out.println(maxTotal);
		
		
	}
}

