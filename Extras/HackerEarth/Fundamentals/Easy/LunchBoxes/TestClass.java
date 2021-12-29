import java.io.*;
import java.util.*;
//Problem : Launch Boxes
//Problem Link : https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/lunch-boxes-019bf2a5/
class TestClass{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());//number of testcases;
        while(t>0){
            long n,m;
            String bufferStr = br.readLine();
            // System.out.println(bufferStr);
            n = Integer.parseInt((bufferStr.split(" "))[0]);
            m = Integer.parseInt((bufferStr.split(" "))[1]);
            long[] demandArr = new long[(int)m];
            
            for(int i=0;i<m;i++){
                bufferStr="";
                int c =0;
                while((c=br.read())!=(int)' '&&c!=-1&&c!='\n'){
                    bufferStr+=(char)c;
                }
                try{
                    demandArr[i]= Long.parseLong(bufferStr);
                } catch(Exception e){
                    demandArr[i] = Long.parseLong((bufferStr.split(" "))[0]);
                }
            }
            Arrays.sort(demandArr);
            long count =0l;
            for(int i=0;i<m;i++){
                if(n==0)break;
                
                long rem = n-demandArr[i];
                if(rem>=0){count++;
                n-=demandArr[i];
                }
            }
            System.out.println(count);
            t--;
        }

    }
}