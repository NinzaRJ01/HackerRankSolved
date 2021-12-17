/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem : Valid Triangle Or Not 
//Problem Code : TRIVALCH
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[3];
		abc[0] = sc.nextInt();
		abc[1] = sc.nextInt();
		abc[2] = sc.nextInt();
		
		int max = abc[0];
		int maxInd = 0;
		int sumAll = abc[0];
		for(int i=1;i<3;i++){
		    if(abc[i]>max){
		        max = abc[i];
		        maxInd = i;
		    }
		    sumAll+=abc[i];
		}
		int sumOfRemn = 0;
		for(int i=0;i<3;i++){
		    if(i==maxInd)continue;
		    sumOfRemn+=abc[i];
		}
		if(sumOfRemn<max){
		    System.out.println("NO");
		    return;
		}
// 		System.out.println(sumOfRemn);
// 		double area = sumOfRemn/2;
// 		for(int i=0;i<3;i++){
// 		    area*= (sumOfRemn/2)-abc[i];
// 		}
// 		area=Math.sqrt(area);
// 		if(area<=0)System.out.println("1:"+area+"a"+-1);
		else System.out.println("YES");
		
		
		
	}
}

