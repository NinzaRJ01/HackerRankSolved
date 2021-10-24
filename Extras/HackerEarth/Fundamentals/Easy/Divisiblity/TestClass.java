/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader


//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int[] A;int n;String[] tmp;String res;
        BufferedReader br;
        //Taking Inputs :
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tmp = (br.readLine()).split(" ");
        A = new int[n];
        // Problem Can Also  be Solved While Taking Inputs Bt 
        for(int i=0;i<n;i++) 
            A[i] =Integer.parseInt(tmp[i]);
        //Optimal Solution :
        int x =A[n-1]%10;
         if(x==0)res="Yes";else res="No";
        // Brute force
        // long x = 0;
        // for(int i=0;i<n;i++){
        //     int t = A[i]%10;
        //     x += t;
        //     x*=10;
        // }
        // System.out.println(x);
        // x/=10;

        
        
        System.out.println(res);

    }
}

