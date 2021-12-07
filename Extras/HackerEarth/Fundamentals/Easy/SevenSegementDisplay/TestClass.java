import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestClass{
    static long getTotalMatches(String s, Map<Integer,Integer> mmap){

        long total = 0;
        int l = s.length();
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            total+= mmap.get(c-'0');
        }
        return total;
    }
    static String getMaxNumberForGivenMatches(long matches){

        String result ="";
        if(matches==0|matches==1)return "-1";
        if(matches%2==0){
            for(int i=0;i<matches/2;i++){
                result+="1";
            }
        }
        else{
            result+="7";
            matches-=3;
            for(int i=0;i<matches/2;i++){
                result+="1";
            }
        }
        
        return result;
    }
    public static void main(String[] args) throws IOException{
        /**
         * Alice got a number written in seven segment format where each segment was creatted used a matchstick.

            Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.

            Alice is wondering what is the numerically largest value that she can generate by using at most the 
            matchsticks that she currently possess.Help Alice out by telling her that number.

            "124" -> 2+5+4-> 11 -> ["7",8]->["71,111"]
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases  = Integer.parseInt(br.readLine());
        Map<Integer,Integer> mmap = new HashMap<>();
        //Setting Values of Each Digits acc. to Seven Segement 
        mmap.put(0,6);mmap.put(1,2);mmap.put(2,5);
        mmap.put(3,5);mmap.put(4,4);mmap.put(5,5);mmap.put(6,6);
        mmap.put(7,3);mmap.put(8,7);mmap.put(9,6);

        while(testCases!=0){
            String input = br.readLine();
            long totalMatchSticks = getTotalMatches(input,mmap);
            System.out.println(getMaxNumberForGivenMatches(totalMatchSticks));
            testCases--;
        }
    }
}