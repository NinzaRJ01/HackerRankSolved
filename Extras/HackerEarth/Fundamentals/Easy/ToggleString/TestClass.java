import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// Problem : Toggle String
// Problem Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
public class TestClass{
    static boolean isAlphabet(char c){
        boolean isBetweenaz = (c>='a')&&(c<='z')?true:false;
        boolean isBetweenAZ = (c>='A')&&(c<='Z')?true:false;
        if(isBetweenAZ||isBetweenaz)return true;
        return false;
    }
    static char toggle(char c){
        boolean isBetweenaz = (c>='a')&&(c<='z')?true:false;
        char toggledC = c;
        int relativePos = c;
        if(isBetweenaz){
            relativePos -='a';//relative positon between a and  given character
            toggledC = (char)((int)'A'+relativePos);
        }
        else{
            relativePos -='A';//relative positon between a and  given character
            toggledC = (char)((int)'a'+relativePos);
        }
        return toggledC;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString  = br.readLine();
        int strLen = inputString.length();
        char[] rsltStr= new char[strLen];
        for(int i=0;i<strLen;i++){
            char crntChar = inputString.charAt(i);
            if(isAlphabet(crntChar)){
                crntChar = toggle(crntChar);
            }
            rsltStr[i]=crntChar;
        }
        System.out.println(new String(rsltStr));

    }
}
