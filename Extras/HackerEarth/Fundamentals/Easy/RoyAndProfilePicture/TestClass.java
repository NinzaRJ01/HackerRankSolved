import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Problem : Roy And Profile Picture
// Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/
public class TestClass{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int L = Integer.parseInt(br.readLine());//Minimum Height and Width of Picture
    int N = Integer.parseInt(br.readLine());// Number of Images
    while(N!=0){
        String[] dimensions = (br.readLine()).split(" ");// Dimension = [Width, Height]
        int width = Integer.parseInt(dimensions[0]);//width of current picture
        int height = Integer.parseInt(dimensions[1]);//height of current picture
        String message = "ACCEPTED";
        if(width<L||height<L)message = "UPLOAD ANOTHER";
        else if(width!=height)message = "CROP IT";
        System.out.println(message);
        N--;
        }
    }
}
