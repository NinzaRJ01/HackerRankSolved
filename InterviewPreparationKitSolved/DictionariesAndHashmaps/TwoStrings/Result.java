import java.util.*;
class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        boolean[] hinterArray = new boolean[256];//hints if element seen before
        System.out.println(hinterArray[1]);
        int l1 = s1.length();
        int l2 = s2.length();
        boolean hasCommonStr = false;
        for(int i=0;i<l1;i++)
            hinterArray[(int)(s1.charAt(i))]=true;
        for(int i=0;i<l2;i++)
            if(hinterArray[(int)(s2.charAt(i))]){
                hasCommonStr = true;
                break;
            }
        return hasCommonStr?"YES":"NO";
    }

}
