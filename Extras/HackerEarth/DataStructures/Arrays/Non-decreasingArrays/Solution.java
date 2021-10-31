import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
import java.io.IOException;
import java.util.Scanner;

public class Solution{
   
    public static void main(String[] args) throws IOException{//Main Thread Method
            // Task :
            //Conclude B from A
        /* 
            Rules/Contraints Regarding B :
            1. len(B) == len(A) = True
            2. for i<-0 to i<-n :
                  2.1  B[i-1] <=B[i] ==True
                  Also
                  2.2 B[i] % A[i] ==0 ==True
            
        */
        int t;/*TestCases */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){//O(n ^ 2)
            int n;int[] B ;String[] s;/* SizeOfArray,Resultant Array, Temporay Array */
            Scanner sc;//Scanner
            n = Integer.parseInt(br.readLine());
            sc = new Scanner(br);
            B = new int[n];
            for(int i=0;i<n;i++){// Contain Program to find  all ith element of B using A
                int key = sc.nextInt();
                if(i!=0){
                    B[i] = (int) Math.ceil((double)B[i-1]/key)*key;
                }else B[i]=key; 
            }
            
            for(int i:B)
                System.out.print(i+" ");
            System.out.println();
            sc.close();
        }
        
    }
}