/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        */
        //Taking Inputs 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());//Number of test cases
        
        String[] tm;
        
        // Write your code here
        for(int j=0;j<t;j++){
            int n = Integer.parseInt(br.readLine());
            tm = (br.readLine()).split(" ");
            int A[] = new int[n];
            for(int i=0;i<n;i++){//O(n)
                A[i]=Integer.parseInt(tm[i]);
            }
            int B[] = new int[n];
            for(int i=0;i<n;i++)B[i]=0;
            //Greedy Solution 
            B[0] = A[0];
            for(int i=1;i<n;i++){
                double d = ((double)B[i-1])/((double)A[i]);
                B[i] = (int)Math.ceil(d)*A[i];
            }
            for(int i:B)System.out.print(i+" ");
            System.out.println();
        }
    }
}

