import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class TestClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> pair = new ArrayList<>();//Logic pairList -> [0,1](pair - 0),[2,3](pair - 1),[4,5](pair-2)-- soon
        Map<Integer,Integer> mmap = new HashMap<>();
        while(sc.hasNext()){
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            if(val1==-1||val2==-1)break;
            pair.add(val1);
            pair.add(val2);

            boolean hasKeyForVal1  = mmap.containsKey(val1);
            boolean hasKeyForVal2  = mmap.containsKey(val2);
            if(hasKeyForVal2 && hasKeyForVal1){
                mmap.put(val1,mmap.get(val1)+1);
                mmap.put(val1,mmap.get(val2)+1);
            }else if(hasKeyForVal1){
                mmap.put(val1,mmap.get(val1)+1);
                mmap.put(val2,1);
            }else if(hasKeyForVal2) {
                mmap.put(val2,mmap.get(val2)+1);
                mmap.put(val1,1);
            }else{
                mmap.put(val1,1);
                mmap.put(val2,1);
            }
            
        }
        int l = pair.size();
        for(int i=0;i<l;i+=2){
            int countForA = mmap.get(pair.get(i));
            int countForB = mmap.get(pair.get(i+1));
            if(countForA>1&&countForB>1)System.out.println("-1 -1");
            else if(countForA>1)System.out.println("0 1");
            else if(countForB>1)System.out.println("1 0");
            else System.out.println("-1 -1");
        }
        

    }
}