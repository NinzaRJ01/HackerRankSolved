/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : Alternative Square Pattern
//Problem Code : SQALPAT

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
// 		int[] a = {1,2,3,4,5};
		boolean inReverse = false;
		int first = 1;//first element of track
		int last = 5;//last element of track
		for(int i=1;i<=n;i++){
		    last=i*5;
		    first = last-4;
		    if(inReverse){
		        System.out.print(last);
		        for(int j=1;j<5;j++){
		            System.out.print(" "+(last-j));
		            
		        }
		    }
		    else {
		        System.out.print(first);
		        for(int j=1;j<5;j++){
		            System.out.print(" "+(first+j));
		        }
		    }
		    System.out.println();
		    inReverse=!inReverse;
		}
	}
}

