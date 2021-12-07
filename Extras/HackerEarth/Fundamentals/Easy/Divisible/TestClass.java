import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class TestClass{
    


    static boolean check(String n){
        int length=n.length();
        long rem = 0;
        for(int i=0;i<length;i++){
            rem = ((rem*10)+(n.charAt(i)-'0'))%11;
        }
        return rem == 0;
    }


    public static void main(String[] args) throws Exception{
            
        
        
        /*
        Problem Statement :
        You are given an array A of size N  that contains integers. Here,

 N is an even number. You are required to perform the following operations:

    Divide the array of numbers in two equal halves
    Note: Here, two equal parts of a test case are created by dividing the array into two equal parts.
    Take the first digit of the numbers that are available in the first half of the array (first 50% of the test case)
    Take the last digit of the numbers that are available in the second half of the array (second 50% of the test case)
    Generate a number by using the digits that have been selected in the above steps

Your task is to determine whether the newly-generated number is divisible by 11
.*/
        //Taking And Processing Inputs
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sizeOfArray = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(br);
        String[] inputs =new String[sizeOfArray];
        int k=0;
        while(sc.hasNextInt()){
            inputs[k++]= sc.nextInt()+"";
        }
        // String[] inputs = input.split(" ");
        // int[] arr = new int[inputs.length];

        //Solution:
        String resultantDigit = "";
        for(int i=0;i<sizeOfArray/2;i++){
                
                resultantDigit+=inputs[i].charAt(0)+"";
                // resultantDigit*=10;
        }
        for(int i=sizeOfArray/2;i<sizeOfArray;i++){
                int number= Integer.parseInt(inputs[i]);
                resultantDigit+=number%10+"";
                // resultantDigit*=10;
        }
        // resultantDigit/=10;
        // System.out.println(resultantDigit);

        Boolean result = check(resultantDigit);
        System.out.println(result==true?"OUI":"NON");



    }
}