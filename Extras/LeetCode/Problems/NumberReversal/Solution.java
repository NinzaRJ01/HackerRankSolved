class Solution {
    public int reverse(int x) {
        int result = 0;
        int tens = 0;
        while(x!=0){
            int leastSig = x%10;
            int putVal = leastSig;
            try{
            if(((long)result)*10 > Integer.MAX_VALUE || ((long)result)*10<Integer.MIN_VALUE)return 0;
            if(tens>0)
                    result*=10;
            // tens++;
            result+=putVal;
            } catch(Exception e){ return 0;}
            x/=10;
            tens++;
        }
        return result;
    }
}
