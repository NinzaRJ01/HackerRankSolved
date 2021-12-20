import java.io.*;
import java.util.*;
//Problem : Add Natural Numbers
//Problem Code : ADDNATURL
class Codechef{
    public static void main(String[] args)throws IOException{
        long n = (new Scanner(System.in)).nextLong();
        n = n*(n+1);
        n/=2;
        System.out.println(n);
    }
}
