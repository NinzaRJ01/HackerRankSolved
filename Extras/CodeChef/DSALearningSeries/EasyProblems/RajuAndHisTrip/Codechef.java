import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem : Raju And His Trip 
//Problem Code : VALTRI
class Codechef{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String msg = "NO";
        if(N%5==0||N%6==0)msg ="YES";
        System.out.println(msg);
    }
}
