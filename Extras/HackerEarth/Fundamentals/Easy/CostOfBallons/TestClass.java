import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
public class TestClass{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;//TestCases 
        T = Integer.parseInt(br.readLine());
        while(T!=0){
            String[] prices = (br.readLine()).split(" ");
            int priceOfGreenBallon = Integer.parseInt(prices[0]);
            int priceOfPurpleBallon = Integer.parseInt(prices[1]);
            int p = Integer.parseInt(br.readLine());//p -> no of participants;
            
            int noOfTimesFirstQuestionSolved = 0;
            int noOfTimesSecondQuestionSolved = 0;

            for(int i=0;i<p;i++){
                String[] inputs = (br.readLine()).split(" ");
                
                boolean isFirstSolved = "1".equals(inputs[0]);
                boolean isSecondSolved = "1".equals(inputs[1]);
                if(isFirstSolved){
                    noOfTimesFirstQuestionSolved++;
                }
                if(isSecondSolved){
                    noOfTimesSecondQuestionSolved++;
                }
            }
            

            int lesserPrice = priceOfGreenBallon<priceOfPurpleBallon?priceOfGreenBallon:priceOfPurpleBallon;
            int greaterSolved = noOfTimesSecondQuestionSolved>noOfTimesFirstQuestionSolved?noOfTimesSecondQuestionSolved:noOfTimesFirstQuestionSolved;
            

            int greaterPrice = priceOfGreenBallon>priceOfPurpleBallon?priceOfGreenBallon:priceOfPurpleBallon;
            int lessSolved = noOfTimesSecondQuestionSolved<noOfTimesFirstQuestionSolved? noOfTimesSecondQuestionSolved:noOfTimesFirstQuestionSolved;
            

            int totalPrice = (lesserPrice*greaterSolved) + (greaterPrice*lessSolved);
            System.out.println(totalPrice);

            T--;
        }
    }
}