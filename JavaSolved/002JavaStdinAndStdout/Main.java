import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner Scan = new Scanner(System.in);
	// Scan three new int inputs 
	int[] arr = new int[3];
	for(int i=0;i<3;i++){
		arr[i] = Scan.nextInt();
		System.out.println(arr[i]);
		}
	}
}
