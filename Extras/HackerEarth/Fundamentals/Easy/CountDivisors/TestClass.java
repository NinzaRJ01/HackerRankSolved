import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem : Count Divisors
//Problem Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/

public class TestClass{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = (br.readLine()).split(" ");
        int l = Integer.parseInt(inputs[0]);
        int r = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);
        // Given l,r and k, all of them are integers
        int count = 0;
        for(int i=l;i<=r;i++){
            if(i%k==0)count++;
        }
        System.out.println(count);
    }
}