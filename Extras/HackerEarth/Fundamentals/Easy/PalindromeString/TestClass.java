import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int lengthOfStr =  s.length();
        boolean isPalindrome = true;
        for(int i=0;i<lengthOfStr/2;i++){
            int ithIndFromEnd = lengthOfStr-i-1;
            char cFromBegin = s.charAt(i);
            char cFromEnd = s.charAt(ithIndFromEnd);

            if(cFromBegin!=cFromEnd)isPalindrome=false;
        }
        System.out.println(
            isPalindrome==true?"YES":"NO"
        );
    }
    
}
