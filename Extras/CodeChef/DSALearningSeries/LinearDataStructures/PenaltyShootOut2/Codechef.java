/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : Penalty Shoot-Out II 
//Problem Code : PSHOT 

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    String  s = br.readLine();//where length of s is equal to 2*N
		    int goalCounterA = 0;int goalCounterB = 0;
		    int i=0;
		    for( i=0;i<s.length();i+=2){
		        int leftShotsA = --n;
		        int leftShotsB = leftShotsA+1;
		        goalCounterA+= s.charAt(i)-'0';
		        if(goalCounterA>goalCounterB+leftShotsB){
		            i++;
		            break;
		        }
		        if(goalCounterB>goalCounterA+leftShotsA){
		            i++;
		            break;
		        }
		        leftShotsB--;
		        goalCounterB+= s.charAt(i+1)-'0';
		        if(goalCounterA>goalCounterB+leftShotsB){
		            i+=2;
		            break;
		        }
		        if(goalCounterB>goalCounterA+leftShotsA){
		            i+=2;
		            break;
		        }
		        
		    }
		    System.out.println(i);
		}
	}
}

