import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TestClass{
    static int findInversionCountFor(int x,int y, String[][] matrix,int n){
        int result = 0;
        int curr = Integer.parseInt(matrix[x][y]);
        for(int i=x;i<n;i++){
            for(int j=y;j<n;j++){
                int element = Integer.parseInt(matrix[i][j]);
                if(curr>element)result++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases;
        testCases = Integer.parseInt(br.readLine());
        /*
        Problem : Monk and Inversion
            Given -> M matrix of n*n dimensions 
            
            To do : Count Inversions in M 
            Number of inversions, in a matrix is defined as the number of unordered pairs of cells 
            such that cell M[i,j]>M[p,q] where i<=p and j <=q

        */
        while(testCases!=0){
            int n,invrCount = 0;//no of lines
            n = Integer.parseInt(br.readLine());
            String[][] M = new String[n][n];
            for(int i=0;i<n;i++){//Taking Input of Matrix
                String[] input = (br.readLine()).split(" ");
                M[i]= input;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    invrCount+=findInversionCountFor(i, j, M, n);
                }
            }
            System.out.println(invrCount);
            testCases--;
        }
    }
}