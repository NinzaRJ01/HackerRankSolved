import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
        if(s.length()%2!=0){
            return "NO";
        }
        Map<Character,Character> otherSide = new HashMap<>();
        otherSide.put('{','}');
        otherSide.put('(',')');
        otherSide.put('[',']');
        Stack<Character> st = new Stack<>(); 
        int l = s.length();
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            if(c=='{'||c=='('||c=='[')
                st.push(c);
            else {
                if(!st.empty())
                {char lastBrace = st.peek();
                if(c == otherSide.get(lastBrace))
                    st.pop();
                else return "NO";}
                else return "NO";
            }
        }
        return st.empty()?"YES":"NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

