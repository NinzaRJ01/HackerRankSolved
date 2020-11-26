import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");//Concept Used grouping in regex
            Matcher m = p.matcher(line);
            if(!m.find())System.out.println("None");
            else{
                m.find(0);
            do{
                try{
                    System.out.println(m.group(2));
                }
                catch(Exception e){
                    System.out.println("None");
                }
            }while(m.find());
            }
			
			testCases--;
		}
	}
}




