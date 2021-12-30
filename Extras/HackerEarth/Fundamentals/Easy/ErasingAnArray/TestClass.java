import java.io.*;
import java.util.*;
//Problem : Erasing An Array
//Problem Link : https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/erasing-the-array-7e9e0400/
class TestClass{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            //Taking Inputs :-
            int n = Integer.parseInt(br.readLine());
            boolean[] b = new boolean[n];
            for(int i=0;i<n-1;i++){
                b[i] = (br.read())==(int)'1';
                br.read();
            }
            b[n-1] = (br.read())==(int)'1';
            br.readLine();
            // System.out.println(Arrays.toString(b));
            long count = 1l;
            boolean prev = b[0];
            for(int i=1;i<n;i++){
                boolean curr = b[i];
                if(prev==true&&curr==false)count++;
                prev=curr;
            }
            System.out.println(count);
            t--;
        }
    }
}