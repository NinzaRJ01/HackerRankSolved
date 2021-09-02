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
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
        Collections.sort(unsorted,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.length()!=b.length()){
                    return a.length()>b.length() ? 1:-1;
                }
                if(a.length()<(String.valueOf(Long.MAX_VALUE)).length()-10){
                long long_a = Long.parseLong(a);
                long  long_b= Long.parseLong(b);
                return long_a>long_b ? 1:-1;
                }
                for(int i=0;i<a.length();i++){
                    if((int)a.charAt(i)>(int)b.charAt(i)) return 1;
                    if((int)a.charAt(i)<(int)b.charAt(i)) return -1;
                    
                }
                return 0;
            }
        });
        return unsorted;
    }

}

    

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.bigSorting(unsorted);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

