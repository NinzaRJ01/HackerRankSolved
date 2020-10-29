import java.util.Scanner;
public class Main{
	/*Task :
	input n;
	if n is odd print 'Weird'
	else if n is even and inRange(2,5) print Not Weird
	else if  n is even and in Range(6,20) print Weird
	else if n is even and greater than 20 print Not Weird
	*/
	public static void main(String[] args){
	Scanner Scan = new Scanner(System.in);
	int n = Scan.nextInt();
	String result;
	boolean isWeird =false;
	if(n%2!=0) isWeird=true;
	else if(n%2==0 && n>1 && n<6)isWeird=false;
	else if(n%2==0 && n>5 && n<21)isWeird=true;
	else isWeird=false;
	result = isWeird==true?"Weird":"Not Weird";
	System.out.println(result);
	}
}
