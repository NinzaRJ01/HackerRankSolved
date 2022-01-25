/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem Code : SEGDIV
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    static void intializeResultList(List<Integer> llist){
        int num =1;
        while(llist.size()<=500){
            llist.add(num++);
            llist.add(num);
            num+=3;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> llist = new ArrayList<>();
		intializeResultList(llist);
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n  = Integer.parseInt(br.readLine());
		    System.out.print(1);
		    for(int i=1;i<n;i++)
		        System.out.print(" "+llist.get(i));
		    System.out.println();
		    
		}
		
	}
}

