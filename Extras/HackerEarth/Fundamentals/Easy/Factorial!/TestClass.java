    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
    public class TestClass{

        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            byte n = Byte.parseByte(br.readLine());
            int factorialOfN = n;
            n--;
            while(n!=0){
                factorialOfN*=n;
                n--;
            }
            System.out.println(factorialOfN);
        }
    }