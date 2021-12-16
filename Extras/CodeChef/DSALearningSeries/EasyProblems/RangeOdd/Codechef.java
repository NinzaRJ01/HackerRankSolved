import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem : Range Odd;
//Problem Code : RNGEODD
class Codechef{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = (br.readLine()).split(" ");
        int L = Integer.parseInt(inputs[0]);
        int R = Integer.parseInt(inputs[1]);
        if(L%2==0)L++;
        System.out.print(L);
        L+=2;
        for(int i=L;i<=R;i+=2){
            System.out.print(" "+i);
        }
    }
}
