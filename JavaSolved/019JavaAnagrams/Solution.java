import java.util.Scanner;

public class Solution {
    /*Two strings,a and b, are called anagrams if they contain all the same characters in the same frequencies. 
    <Example :
    CAT -> CAT,TAC,CTA.etc
    >
    Output :
    Print "Anagrams" if and are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.
    */
    static boolean isAnagram(String a, String b) {
        a= a.toLowerCase();
        b= b.toLowerCase();
        if(a.length()!=b.length()){
            // System.out.print("*");
            return false;
        }
        else{
           /*
           What we gonna do ?
           --> for an char x at index i in a,
                        we check if char x  exists in b
                            --> if(true)then, we remove won't check that same index 
                                twice.
                            --> else
                                    break 
           */
           char[] charSqOfA = a.toCharArray();
           char[] charSqOfB = b.toCharArray();
           for(int i=0;i<a.length();i++){
               char temp = charSqOfA[i];
            
               if(b.indexOf(temp)>-1){
                   charSqOfB[b.indexOf(temp)]= ':';
                   b = new String(charSqOfB);
                
               }
               else{
                
                   return false;
               }
           }
           
           return true;
        }
        
    }

    
