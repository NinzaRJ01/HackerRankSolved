/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : Chef Loves 1010
//Problem Code : CHEF1010
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t!=0)
	    {
	        int[] zerosAndOnes = new int[2];
	        int N = Integer.parseInt(br.readLine());
	       // System.out.println("a : ");
	        for(int i=0;i<N;i++){
	             boolean b = (br.read()-'0')==1?true:false;
	            if(b==true) zerosAndOnes[1]+=1;
	            else zerosAndOnes[0]+=1;
	        }
	        br.readLine();
	        int maxPairs = zerosAndOnes[0]<zerosAndOnes[1]?zerosAndOnes[0]:zerosAndOnes[1];
	        System.out.println(maxPairs-1!=-1?maxPairs-1:0);
	        t--;
	    }
		
	}
}

