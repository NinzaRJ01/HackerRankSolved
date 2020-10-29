import java.util.Scanner;
/*
Task :
	Given an integer N, print its first 10 multiples. Each 
	multiple N*i should be printed on a new line in form:i= result.
*/
public class Main{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		for(int i=1;i<=10;i++){
		System.out.println(n+" X "+i+" = "+(n*i));	
		}
	}	
}
