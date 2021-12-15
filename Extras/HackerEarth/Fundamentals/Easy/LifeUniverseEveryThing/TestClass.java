import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
// Problem : Life, the Universe, and Everything
// Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
public class TestClass{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while(sc.hasNext()){
            int val = sc.nextInt();
            if(val == 42) break;
            System.out.println(val);
        }
    }
}