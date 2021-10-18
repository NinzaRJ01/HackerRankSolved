/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
// imports for BufferedReader



//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String zooString = br.readLine();
        //Debug Check
        // System.out.println(zooString);
        int x = 0;
        int y = 0;
        int n = zooString.length();
        for(int i=0;i<n;i++)
            if(zooString.charAt(i)=='z')x++;
            else y++;
        zooString =  2*x==y ? "Yes" :"No";
        System.out.println(zooString);
    }
}

