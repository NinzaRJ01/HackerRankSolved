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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
            int max =-10000;
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(6-i<3||6-j<3);//SOMFF
                    //if(arr[i][j]==0)continue;
                    else{int temp = 0;
                    
                    //System.out.println("->"+arr[i][0]);
                        for(int k=j;k<j+3;k++)temp+=arr[i][k];
                        for(int k=i+1;k<i+3;k++)temp+=arr[k][j+1];
                        for(int k=j;k<j+3;k++)temp+=arr[i+2][k];//arr[i+2][j+1] 
                        //addedtwo times
                        temp-=arr[i+2][j+1];
                        if(temp>max)max=temp;
                    }
                }
            }
            System.out.println(max);
            
        

        scanner.close();
    }
}

