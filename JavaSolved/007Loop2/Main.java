import java.util.Scanner;
/*
Problem:
	use integers a,b and n to create folloeing series:
	(a+(2^0)*b),(a+(2^0)b+(2^1)b),....,(a+(2^0)b+(2^1)b...+(2^n-1)b)
	print this series.
Input :
	first line contains an integer,q,denoting the number of queries.
	Each line i of the q subsequent lines contains three space-
*/
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a,b,n;
		/*
		where a,b are value in given equ:
		(a+(2^0)*b),(a+(2^0)b+(2^1)b),....,(a+(2^0)b+(2^1)b...+(2^n-1)b)
		and n no. of iteratorion 
		*/
		
		int val =a;
		String result ="";
		for(int i=0;i<n;i++){
			val += (((int)Math.pow(2,i))*b);
			result + = val + " ";
		}
		System.out.println(result);	
}
