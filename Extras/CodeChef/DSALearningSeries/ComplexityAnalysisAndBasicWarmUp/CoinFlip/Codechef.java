/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Problem : Coin Flip
// Problem Code:CONFLIP 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());//Number of testCases
		while(t--!=0){
		    int g = Integer.parseInt(br.readLine());
		    while(g--!=0){
		        /*
		            1: Head 
		            2: Tails
		            inq[0] : I intail State of Coins 1 or 2
		            inq[1] : N number of coins 
		            inq[2] : Q - 1:2 return number of coins facing of either 1 or 2
		        */
		        int[] inq = Arrays.stream(
		                (br.readLine()).split(" ")
		            ).mapToInt(num->Integer.parseInt(num)).toArray();
		        int half = inq[1]/2;
		        int res;
		        if(inq[1]%2==0)res = half;
		        else{
		            if(inq[2]==1){//return number of heads
		                res = inq[0]==1?half:half+1;
		            }else {// return number of tails
		                res = inq[0]==2?half:half+1;
		            }
		        }
		        System.out.println(res);
    
		    }
		}
		
	}
}

