import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strInput  = (br.readLine()).split(" ");
        
        int sum=0;
        for(int i=0;i<n/2;i++){
            int fromEnd = n-1-i;
            int valI = Integer.parseInt(strInput[i]);
            int valE = 0;
            if(i!=fromEnd){ valE = Integer.parseInt(strInput[fromEnd]); }
            sum+=valI+valE;
        }
        System.out.println(sum);
    }
}

