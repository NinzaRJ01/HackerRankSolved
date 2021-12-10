import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass{
    public static void main(String[] args)throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(br);
        long product =1l;
        for(int i=0;i<N;i++){
            int input  = sc.nextInt();
            product = input * product;
            product = product % (long)(Math.pow(10,9)+7);
        }
        System.out.println(product);
    }
}