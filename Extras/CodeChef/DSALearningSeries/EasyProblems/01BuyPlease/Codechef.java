import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Problem Code - BUYPLSE
//Problem Statement :
/*
Chef went to a shop and buys a pens and b pencils.
Each pen costs x units and each pencil costs y units. 
Now find what is the total amount Chef will spend to buy a pens and b pencils.
*/
public class Codechef{
    public static void main(String[] args)throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = (br.readLine()).split(" ");
        long totalSpent = 0l;
        for(int i=0;i<2;i++){
            long item = Long.parseLong(inputs[i]);
            long price = Long.parseLong(inputs[2+i]);
            totalSpent+= item*price;
        }
        System.out.println(totalSpent);
    }
}