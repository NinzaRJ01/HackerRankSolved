/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Problem : Triangle With Angles
//Problem Code : ANGTRICH
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] sides;//sides of triangle
        sides = Arrays.stream(
            ((new Scanner(System.in)).nextLine()).split(" ")
            ).mapToInt(num->Integer.parseInt(num)).toArray();
        int sumOfAll = 0;
        for(int i=0;i<3;i++){
            if(sides[i]==0){
                System.out.println("NO");
                return;
            }
            sumOfAll+=sides[i];
        }
        System.out.println(sumOfAll==180?"YES":"NO");
	}
}

