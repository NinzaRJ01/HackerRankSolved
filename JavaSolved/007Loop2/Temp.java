import java.util.Scanner;
public class Temp
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scan = new Scanner(System.in);
		String s="";
	while(scan.hasNextLine()){
		 s =s + scan.nextLine() +"\n";
		 
	}
	System.out.println(s);
	}
	
}

