import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

//-----Note : You can't pass the test5 until you switch from scanner to other kind of reader

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[100];
        for(int i=0;i<n;i++ ){
            String[] tmp = br.readLine().split(" ");
            int j=Integer.parseInt(tmp[0]);
            String str = i<n/2?"-":tmp[1];
            if(i<n/2)str="-";
            if(arr[j]==null)
                arr[j]=str+" ";
            else 
                arr[j]+=str+" ";
        }
        for(String i:arr){
            if(i!=null)
                System.out.print(i);
        }
    }
}

