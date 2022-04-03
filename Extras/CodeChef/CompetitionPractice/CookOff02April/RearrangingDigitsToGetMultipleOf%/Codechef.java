/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int d = Integer.parseInt(br.readLine());
		    String s = br.readLine();
		    //if contains 0 or 5
		    String res = "No";
		    for(int i=0;i<s.length();i++){
		        char ch = s.charAt(i);
		        if(ch=='5'||ch=='0'){res="Yes";break;}
		    }
		    System.out.println(res);
		}
	}
}

