import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem Code :ISBOTH
class Codechef{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res= "NONE";
        if(N%5==0&&N%11==0)res = "BOTH";
        else if(N%5==0||N%11==0)res = "ONE";
        System.out.println(res);
    }
}