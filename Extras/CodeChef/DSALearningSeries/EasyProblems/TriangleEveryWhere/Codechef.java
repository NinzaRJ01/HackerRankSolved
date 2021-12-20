import java.io.*;
import java.util.*;
//Problem : Triangle EveryWhere
//Problem Code : EXTRICHK
class Codechef{
    public static void main(String[] args){
        int[] sides = Arrays.stream(
            (
                (
                    new Scanner(System.in)
                    ).nextLine()
                ).split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
        int res = -1;
        int countEqualSides = 1;
        int maxInd = 0;
        for(int i=1;i<3;i++){
            if(sides[i]==sides[0])countEqualSides++;
            if(sides[i]>sides[maxInd])maxInd=i;
        }
        int remain = 0;
        for(int i=0;i<3;i++){
            if(i!=maxInd)remain+=sides[i];
        }
        if(sides[maxInd]>=remain){
            System.out.println(res);
            return;
        }
        if(countEqualSides==3)res=1;
        else if(countEqualSides==2)res=2;
        else res=3;
        System.out.println(res);
        
    }
}
