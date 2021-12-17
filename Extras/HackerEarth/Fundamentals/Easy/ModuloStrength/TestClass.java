import java.math.BigInteger;
import java.util.*;
//Problem :Modulo Strength
//Problem Link : https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/golf/modulo-strength-4/
public class TestClass{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        Map<Integer,Integer> mmap = new HashMap<>();//map special no  to student-count;
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0;i<N;i++){
            int val = sc.nextInt();
            int specialNo = val%K;
            if(mmap.containsKey(specialNo)){
                mmap.put(specialNo,mmap.get(specialNo)+1);
            }
            else
            mmap.put(specialNo,1);
        }
        BigInteger bd = new BigInteger("0");
        for(int i:mmap.keySet() ){
            int x = mmap.get(i);
            BigInteger add = new BigInteger(""+x).multiply(new BigInteger(""+(x-1))) ;
            bd = bd.add(add);
            
        }
        System.out.println(bd);
    }
}