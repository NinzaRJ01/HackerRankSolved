/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem : LADDU
//Problem Code : LADDU
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    /*
		        CONTEST_WON : 300 + BONUS where BONUS = 20 - Rank if Rank < 20
		        TOP_CONTRIBUTOR on Discuss : 300
                BUG_FOUND : 50 - 1000 (depending on the bug severity). It may also fetch you a CodeChef internship!
                CONTEST_HOSTED : 50 
		    */
		    String s = br.readLine();
		    int n = Integer.parseInt((s.split(" "))[0]);//number of activites
		    boolean isIndian = (s.split(" "))[1].equals("INDIAN");
		    int reedemLimitMonth = isIndian?200:400;
		    long totalAmount = 0l;
		    for(int i=0;i<n;i++){
		        s = br.readLine();
		        String[] activiteAndLaddos = s.split(" ");
		        if(activiteAndLaddos[0].equals("CONTEST_WON")){
		            long rank = Long.parseLong(activiteAndLaddos[1]);
		            totalAmount += 300 + (20-(rank<20?rank:20));
		        }
		        else if(activiteAndLaddos[0].equals("TOP_CONTRIBUTOR")){
		            totalAmount+=300;
		        }
		        else if(activiteAndLaddos[0].equals("BUG_FOUND")){
		            long price = Integer.parseInt(activiteAndLaddos[1]);
		            totalAmount+=price;
		        }
		        else totalAmount+=50;
		    }
		    System.out.println(totalAmount/reedemLimitMonth);
		}
	}
}

