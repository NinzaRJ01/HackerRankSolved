import java.io.*;
import java.util.*;
//Problem : Reverse Star Pattern
//Problem Code : REVSTRPT
class Codechef{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n;
        n--;//removed empty line 
        while(n>=0){
            for(int i=0;i<n;i++)//will use to print spaces
                System.out.print(" ");
            for(int j=n;j<N;j++)//will print " "
                System.out.print("*");
            System.out.println();
            n--;
        }
        
        sc.close();
        
    }
}
