import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class TestClass{
    static boolean checkFormat(String s){
        Pattern format = Pattern.compile("^\\d{2}[A-Z]\\d{3}-\\d\\d$");
        Matcher m = format.matcher(s);
        return m.matches();

    }
    static boolean isVowel(char c){
        char[] vowels = {'A','E','I','O','U','Y'};
        for(int i=0;i<vowels.length;i++){
            if(c==vowels[i])return true;
        }
        return false;
    }
    static boolean isCorrect(String s){
        int prev = s.charAt(0) -'0';
        for(int i=1;i<s.length();i++){
            if(i==2||i==6){
                prev = s.charAt(i+1) -'0';
                i++;
                continue;
            }
            int curr = s.charAt(i)-'0';
            if((curr+prev)%2!=0)return false;

            prev=curr;

        }
        return true;
    }
    public static void main(String[] args)throws IOException{

        /**
         * Arpasland has surrounded by attackers. A truck enters the city. 
         * The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid 
         * if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.
         * We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.
         *  Format : The first line contains a string of length 9. 
         * The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        boolean isInCorrentFormat = checkFormat(inputStr);
        if(isInCorrentFormat){
            String res = "invalid";
            if(!isVowel(inputStr.charAt(2))){
                if(isCorrect(inputStr)) 
                    res="valid";
            }
            System.out.println(res);
        }
        else{
            System.out.println("invalid");
        }
    }
}