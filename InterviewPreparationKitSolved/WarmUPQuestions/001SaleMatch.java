import java.util.ArrayList;

public class SaleMatch{
    public boolean iN(int a,int[] b){
        for(int i :b){
            if(i==a){
                return true;
            }
        }
        return false;
    }
    public int sockMerchant(int n ,int[] arr){
        int[] stack = new int[n];
        ArrayList<Integer> stockVal = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(iN(arr[i],stack)){
               stockVal.add(arr[i],(stockVal.get(arr[i])+1)    );

            }
            else{
                stack[i]=arr[i];
                stockVal.add(arr[i],1);
            }
        }
        int pair =0;
        for (int i:stack){
            int x=stockVal.get(i);
            if (x%2==0 && x!=0){
                pair+= x/2;
            }
            else if(x%2!=0 && x!=0){
                pair+=(x-1)/2;
            }
        }
        return pair;
    } 
    public static void main(String[] args){
        Array arr =  10,20,20,10,10,30,50,10,20;
        

    }
} 