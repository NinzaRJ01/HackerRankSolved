import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     
     <--Explaination-->
     ^ outside closed braces in regex mean start of line.
     So, ^[A-Za-z] => Any single Character between A to Z and a to z at starting of string.
     [A-Za-z0-9_] => Any single element bet. AtoZ , atoz ,_ or 0-9
     Since we use ^[A-Za-z] means one charater must need to lessen in following regex
     Therefore, [A-Za-z0-9_]{(8-1),(30-1)} => [A-Za-z0-9_]{7,29}
     At Last => ^[A-Za-z][A-Za-z0-9_]{7,29}
     */ 
     
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
