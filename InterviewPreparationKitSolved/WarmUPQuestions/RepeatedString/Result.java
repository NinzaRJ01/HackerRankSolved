import java.io.*;
import java.util.*;
class Result{
   public static long repeatedString(String s,long n){
       long countOfAsInN = 0l;
       char[] arrOfS = s.toCharArray();
       long countInS = 0l;
       int l = (int)Math.min((long)arrOfS.length,n); // return l == arr length if not greater than n 
       for(int i=0;i<l;i++){//O(min(s.length,n))
           if(arrOfS[i]=='a')countInS++;
       }
       long times;//how much bigger is n compare to s;
       times = n/arrOfS.length;
       countOfAsInN = (times>0?times:1)*countInS;
       if(times>0){
            long remain = n % arrOfS.length;;//remaining length
            for(int i=0;i<remain;i++)//O(s.length-1)
                if(arrOfS[i]=='a')countOfAsInN++;
       }
        
       return countOfAsInN;
   }
}