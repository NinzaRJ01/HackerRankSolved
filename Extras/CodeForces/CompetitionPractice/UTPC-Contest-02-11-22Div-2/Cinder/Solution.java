import java.io.*;
import java.util.Map;
import java.util.HashMap;
public class Solution extends Object{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,Integer> mmap = new HashMap<>();
        while(n--!=0){
            String s = br.readLine();
            String res="OK";
            if(mmap.containsKey(s)){
                int val = mmap.get(s);
                res = s+(val);
                mmap.put(s,val+1);
                mmap.put(res,mmap.getOrDefault(res, 1));
            }
            else mmap.put(s,1);
            System.out.println(res);
            
        }
    }
}