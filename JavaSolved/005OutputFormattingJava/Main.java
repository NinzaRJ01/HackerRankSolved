

import java.util.Scanner;
/*
Input: 
	(1 string and 1 integer )three times.
Output:
	In each line of output there should be teo columns.
	-->The first column contains the String and is left justified using exactly characters.
	-->The second column contains the integer, expressed in exactly digits;
	--> if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/
public class Main{



    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");

    }


}
