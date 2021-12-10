import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class TestClass{
    static long[] getSumArray(int[] A){//return Array res where A[i] = A[i]+ Sum of pervious elements
        long[] res = new long[A.length];
        long sum = A[0];
        res[0] =sum;
        for(int i=1;i<A.length;i++){
            if(sum<Long.MAX_VALUE)
                sum+=A[i];
            res[i]=sum;
        }
        return res;
    }
    static int indexOfMax(long[] A){
        long max = A[0];
        int ind=0;
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
                ind =i;
            }
        }
        return ind;
    }
    static long bestIndex(int[] A,int n){//returns bestIndex in Array A where n is length of Array
        int bestInd = -1;
        long[] specialArray = new long[n];//Special Array consisting of special sum
        int j = 2; //where defines no of elements with certain prop to specail sum calculation
                    //prop ->
                    // j =  j(j-1)/2 gives no of element to pick from certain index 
        int counterOfJ = 2;
        long specialSum = 0;
        long[] sumArray = getSumArray(A);

        for(int i=n-1;i>=0;i--){
            counterOfJ--;
            int noOfElementsCanPick = ((j*(j-1))/2)-1;
            
            if(i>0)
                specialSum = sumArray[i+noOfElementsCanPick]-sumArray[i-1];
            else
            specialSum = sumArray[i+noOfElementsCanPick];
            specialArray[i] = specialSum;
            
            if(counterOfJ==0){
                j++;
                counterOfJ=j;
            }
            
        }
        bestInd = indexOfMax(specialArray);
        return specialArray[bestInd];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N;int[] Arr;/* No of element to scan, Array to which i have to find best index */

        N  = Integer.parseInt(br.readLine());
        Arr =new int[N] ;
        // String[] inputs = (br.readLine()).split(" ");
        // for(int i=0;i<N;i++){//Parse Input Strings To Integer
        //     Arr[i]=Integer.parseInt(inputs[i]);
        // }
        Scanner sc = new Scanner(br);
        for(int i=0;i<N;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(bestIndex(Arr, N));
    }
}