import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat nfOfUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfOfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat nfOfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfOfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + nfOfUs.format(payment));
        System.out.println("India: " + nfOfIndia.format(payment));
        System.out.println("China: " + nfOfChina.format(payment));
        System.out.println("France: " + nfOfFrance.format(payment));
    }
}
