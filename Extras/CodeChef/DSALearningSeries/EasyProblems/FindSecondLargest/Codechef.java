import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem : Find Second Largest 
//Problem Code : SECLAR
class Codechef{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first =  Integer.parseInt(br.readLine());
        int second =  Integer.parseInt(br.readLine());
        int third =  Integer.parseInt(br.readLine());

        int maxBet1and2 = Math.max(first,second);
        int maxBet2and3 = Math.max(second,third);
        int maxBet1and3 = Math.max(first,third);

        int secondMax=-1;
        int max = Math.max(maxBet1and2,maxBet2and3);
        if(maxBet1and2!=maxBet2and3)//
            secondMax=Math.min(maxBet1and2,maxBet2and3);
        if(maxBet2and3==maxBet1and2){
            if(maxBet1and2==max)
                secondMax= maxBet1and3;
            else secondMax = maxBet2and3;
        }
        System.out.println(secondMax);
    }
}