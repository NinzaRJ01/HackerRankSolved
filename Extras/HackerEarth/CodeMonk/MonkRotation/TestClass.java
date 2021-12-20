import java.io.*;
import java.util.*;
//Problem : Monk And Rotation
//Problem Link : https://www.hackerearth.com/practice/codemonk/
class TestClass{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();//no of testcases
        while(t>0){
            int n = sc.nextInt();//no of elements
            int k = sc.nextInt();//no of steps of rotation
            k = k%n;//since n is limited;
            int[] A = new int[n];
            for(int i=0;i<n;i++)
                A[i]=sc.nextInt();
            //pick elements form n-k to n
            int[] pickedElements = new int[k];  
            for(int i=n-k;i<n;i++){
                pickedElements[i-(n-k)] = A[i];
            }
            //right shift elements
            for(int i=n-(k+1);i>=0;i--){
                A[i+k]=A[i];
            }
            //put back picked elements
            for(int i=0;i<k;i++){
                A[i]=pickedElements[i];
            }
            System.out.print(A[0]);
            for(int i=1;i<n;i++)
                System.out.print(" "+A[i]);
            t--;
        }
        sc.close();
    }
}