import java.util.Scanner;
public class Main{
	public static<T> void printLine(T element){
	if(element.getClass().getName()=="java.lang.Integer")
	System.out.println("Int: "+ element);
	else if(element.getClass().getName()=="java.lang.Double")
	System.out.println("Double: "+element);
	else
	System.out.println("String: "+element);
	}
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt();
	double d= scan.nextDouble();
	scan.nextLine();
	String s = scan.nextLine();
	printLine(s);
	printLine(d);
	printLine(i);
	
	}
}
