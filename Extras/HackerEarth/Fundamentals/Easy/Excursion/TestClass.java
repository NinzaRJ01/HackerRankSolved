import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class TestClass{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;//no of testcases;
        t = Integer.parseInt(br.readLine());
        while(t!=0){//N be no of boys ...
            //M be no of girls..
            //K be no of seats in room..
            int[] nmk; //in this array 0th element -> n ,1st element -> m and 2nd element -> k
            nmk = Arrays.stream((br.readLine()).split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
            long rooms = 0l;
            
            //boys in k pairs room
            rooms+=nmk[0]/nmk[2];

            //girls in k pairs room 
            rooms +=nmk[1]/nmk[2];
            
            //remaining boys
            if(
                nmk[0]%nmk[2]!=0 
                )rooms+=1;
            //remaining girls
            if(
                nmk[1]%nmk[2]!=0 
                )rooms+=1;
            System.out.println(rooms);
            t--;
        }
    }
}