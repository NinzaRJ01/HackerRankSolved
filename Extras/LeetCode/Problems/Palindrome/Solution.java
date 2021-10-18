class Solution {
//     public int reverseInt(int num){//Reverse Integer
//         int res = 0;
//         while(num!=0){
//             res+=num%10;
//             if(num/10!=0)res*=10;
//             num/=10;
//         }
        
//         return res;
//     }
    public boolean isPalindrome(int x) {
        /*
            Cases :
                > x can be negative ->reject
                > x can be positive -> check if palandrome
            Solutions:
                -> Brute Force :
                        return x == x.reverse();
                        Time Complexty n
                
                -> Half Way Solution:O(n/2)
                    traverse half of list , check if ith element  equals to n-ith element for each traversed element
        */
        if(x<0)return false;
        //---Brute Force ---
        // return x == reverseInt(x);
        
        //---Half Way Solution
        String s = x+"";
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i-1))return false;
        }
        return true;
    }
}
