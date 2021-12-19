import java.io.FileReader;
import java.util.*;
class Result{
    public static List<Integer> rotLeft(List<Integer> a, int d) {//a is given list to modify , d is number left rotation to perform
            int l = a.size();//will store the length of List
            //Todo :
            //save the first d elements in separate array
            // move element from dth to lth rocating to lower bound
            //then put elements to last dth positions

            //saving first 0 to d-1 elements
            int[] firstD = new int[d];
            for(int i=0;i<d;i++)
                firstD[i]=a.get(i);
            
            //moving element to left most positions
            for(int i=d;i<l;i++)
                a.set(i-d, a.get(i));
            
            //puting saved elements in end
            for(int i=l-d;i<l;i++)
                a.set(i,firstD[i-(l-d)]);
            return a;
        }
}
