import java.io.*;
// import java.util.Arrays;
class TestClass{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--!=0){
            int n = Integer.parseInt(br.readLine());
            char[] s = (br.readLine()).toCharArray();
            int[] mmap = new int[26];
            
            //count characters 
            for(int i=0;i<n;i++)mmap[s[i]-'a']+=1;
            long cost = 0l;
            for(int i=0;i<26;i++){
                int l = n - mmap[i];
                if(n==0)break;
                // System.out.println(Arrays.toString(s));
                char[] nextString = new char[l] ;
                int itrS = 0;
                int count = 0;
                for(int j=0;j<n;j++){
                    int key = s[j]-'a';
                    if(key == i){
                        cost+=((j+1)-count);
                        count++;
                    }else{
                        nextString[itrS++] = s[j];
                    }
                }
                s=nextString;
                n=l;
                
            }
            System.out.println(cost);
            
        }

    }
}