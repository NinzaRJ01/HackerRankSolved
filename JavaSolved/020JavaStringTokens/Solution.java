import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] newStr = s.split("[ !,?._'@]+");
        String Result ="";
        int l = newStr.length;
        for(int i=0;i<newStr.length;i++){
            if(!newStr[i].isEmpty())
            Result = Result + newStr[i]+"\n";
            else l-=1;
        }
        
        System.out.println(l);
        System.out.print(Result);
        scan.close();
    }
}

