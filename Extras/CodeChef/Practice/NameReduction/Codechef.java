/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(
		        new InputStreamReader(System.in)
		    );
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    String prnts = (br.readLine()).replace(" ","");
		    int n = Integer.parseInt(br.readLine());
		    String[] a = new String[n];
		    for(int i=0;i<n;i++)
		        a[i] = br.readLine();
		    long[] mmap = new long[256];
		    long totalLen = 0;
		    for(String s : a){
		        totalLen+=s.length();
		        for(int i=0;i<s.length();i++)
		            mmap[s.charAt(i)]+=1l;
		    }
		    if(totalLen>prnts.length()){
		        System.out.println("NO");
		        continue;
		    }
		    for(int i=0;i<prnts.length();i++){
		        mmap[prnts.charAt(i)]-=1l;
		    }
		    String res = "YES";
		    for(int i=0;i<256;i++){
		        if(mmap[i]>0)res="NO";
		    }
		    System.out.println(res);
		}
	}
}

