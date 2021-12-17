import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.TextUI;
//Problem : Number of Steps 
//Problem Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/
public class TestClass{
    static boolean isAllEqual(int[] a){
        int val = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]!=val)return false;
        }
        return true;
    }
    static int getIndexOfMax(int[] a){
        int max = a[0];
        int ind = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                ind = i;
            }
        }
        return ind;
    }
    static int minimumSteps(int[] a,int[] b){

        int indOfMax = -1;
        int steps = 0;
        while(!isAllEqual(a)){
            indOfMax = getIndexOfMax(a);
            int val=a[indOfMax];
            if(val>=b[indOfMax])val-=b[indOfMax];
            else break;
            a[indOfMax]=val;
            // if(isAllNegative(a))break;
            steps++;
        }
        if(isAllEqual(a)) 
            return steps;
        else 
            return -1;
    }
    public static void main(String[] args) throws IOException{
        int[] A,B;
        int n ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        A = new int[n];
        B = new int[n];
        Scanner sc = new Scanner(br);
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }

        int steps = minimumSteps(A, B);
        System.out.println(steps);
    }
}