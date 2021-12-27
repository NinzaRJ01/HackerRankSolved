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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    /*
        Debuging Statement 1:
    */  
        PriorityQueue<Integer> pQ= new PriorityQueue<Integer>(Collections.reverseOrder());
        Stack<Integer> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        long top =-1l;
        for(String s:operations){
            char oprType = s.charAt(0);
            if(oprType=='1'){//Push Element To Stack
                int num = Integer.parseInt((s.split(" "))[1]);
                st.push(num);
                pQ.add(num);
            }
            if(oprType=='2'){
                pQ.remove(st.pop());
            }
            if(oprType=='3'){
                res.add(pQ.peek());
            }
        }
        return res;
    }
        
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

