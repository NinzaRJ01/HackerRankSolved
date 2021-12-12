//Problem Code : DIFACTRS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Codechef{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        //brute force solution
        String res = "1";
        long count =1l;
        for(long i=2;i<N;i++){
            if(N%i==0){
                res= res+" "+i;
                count++;
            }
        }
        res= res+" "+N;
        System.out.println(count);
        System.out.println(res);
    }
}