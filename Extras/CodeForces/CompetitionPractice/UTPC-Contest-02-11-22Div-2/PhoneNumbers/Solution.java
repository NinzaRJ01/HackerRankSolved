import java.io.*;

public class Solution{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--!=0){
            String[] inp = (br.readLine()).split(" ");
            int sum = 0;
            for(int i=0;i<inp[1].length();i++){
                sum+=(inp[1].charAt(i)-'0');
                sum%=10;
            }
            if(sum%2==0)System.out.println(inp[0]);
        }
        br.close();
    }
}