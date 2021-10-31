import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
import java.io.IOException;

public class Solution{
    private static void getB(int[] A,int n){

    }
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
            n = Integer.parseInt(br.readLine());
            s = (br.readLine()).split(" ");
            B = new int[n];

            B[0]=Integer.parseInt(s[0]);
            for(int i=1;i<n;i++){
                int key = Integer.parseInt(s[i]);
                B[i] = (int) Math.ceil((double)B[i-1]/key)*key;
            }
            for(int i:B)
                System.out.print(i+" ");
            System.out.println();

        }

    }
}