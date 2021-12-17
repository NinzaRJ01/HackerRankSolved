/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : Find Me 
//Problem Code :FINDMELI

class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    Scanner sc  = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    for(int i=0;i<N;i++){
	        int val = sc.nextInt();
	        if(val==K){
	            System.out.println(1);
	            return;
	        }
	    }
	    System.out.println(-1);
	}
}

