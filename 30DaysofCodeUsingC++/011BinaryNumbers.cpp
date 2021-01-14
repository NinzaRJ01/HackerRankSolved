import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int maxConsX = 0;//maximum consecutive x's
        int consX =0;//count consecutive x's
        int pre;
        while(n>0){//Time Complexity O(no. of digit in binary value of(n))=>O(i)
            int currentBin = n%2;
            n/=2;
            if(currentBin==1){
                consX++;
                if(maxConsX<consX){
                    maxConsX=consX;
                }    
            }
            if(currentBin==0){//if there happens to be zero in binaries conX should be revert to 0
                consX=0;
            }
            
        }
        System.out.println(maxConsX);
        
    }
}
