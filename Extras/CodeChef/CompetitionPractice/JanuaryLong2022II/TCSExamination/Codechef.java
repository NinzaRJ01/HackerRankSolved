/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//Problem : TCS Examination
//Problem Code : EXAMTIME


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int[] dragonsMrks = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    int[] slothsMrks = Arrays.stream(
		            (br.readLine()).split(" ")
		        ).mapToInt(num->Integer.parseInt(num)).toArray();
		    String res = "TIE";
		    int totalDragonsMrks = 0;
		    int totalslothsMrks = 0;
		    for(int i=0;i<3;i++){
		        totalDragonsMrks+= dragonsMrks[i];
		        totalslothsMrks+= slothsMrks[i];
		    }
		    if(totalslothsMrks!=totalDragonsMrks){
		        res = totalDragonsMrks>totalslothsMrks?"DRAGON":"SLOTH";
		    }else{
		        for(int i=0;i<3;i++){
		            if(dragonsMrks[i]!=slothsMrks[i]){
		                res = dragonsMrks[i]>slothsMrks[i]?"DRAGON":"SLOTH";
		                break;
		            }
		        }
		    }
		    System.out.println(res);
		}
	}
}

