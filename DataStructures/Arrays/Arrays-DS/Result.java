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
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    /*
    *  Solution Logic ->
    *          >For n - Length Array<
    * let   a =   | 1  | 2  | 3  |  4  |  5  |  6   |
    *               \                           /
    *                  ----- change places-----
    * we get ,
    *       a =   | 6  | 2  | 3  |  4  |  5  |  1   |
    *             
    *   - replace ith element of array with ith element from other end of array
    *  1 4 3 2    
    */
    
        int buf =0;
        int l = a.size();
        for (int i=0 ;i<(l/2);i++ ){
            
            int ithElFromEnd = l-i-1;
            
            buf = a.get(i);
            a.set(i,a.get(ithElFromEnd))  ;
            a.set(ithElFromEnd,buf);
        }
        
        return a;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

