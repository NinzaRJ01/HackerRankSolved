import java.io.*;
import java.util.Arrays;
class Node{
    public int data;
    public Node next=null;
}
class TestClass{
    static long  countTime(int[] b,Node head, int n){
	long  count = 0;
	// cout<<"HI "<<n<<endl;
	for(int i=0;i<n;i++){
		int val = b[i];
		
		//search and delete from cicular linked list;
		while(head.next.data != val){
			// if(count>5)break;
			count++;	
			head = head.next;
		}
		//deleting
		head.next = head.next.next;		
		count++;
 
	}
	return count;
}
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char ch;String el = "";
        
        Node head = new Node();
        head.next = null;
        while((ch = (char)br.read())!=-1&& ch!='\n' && ch!=' '){
            el = el+""+ch;
        }
        // System.out.println(el);
//Cirular Linked List 
        head.data = Integer.parseInt(el);
        Node ptr = head;
        for(int i=1;i<n;i++){
            el ="";
            while((ch = (char)br.read())!=-1&&ch!='\n'&&ch!=' '){
                el = el+""+ch;
                
            }
            // System.out.println(el);
            ptr.next = new Node();
            ptr = ptr.next;
            ptr.data = Integer.parseInt(el);
        }
        ptr.next = head;
 
        int[] b  = new int[n];
        for(int i=0;i<n;i++){
            el ="";
            int a = 0;
            while((a = br.read())!=-1&&a!=(int)'\n'&&a!=(int)' '){
                // System.out.println(a);
                el = el+""+(char)a;
            }
            b[i] = Integer.parseInt(el);
            // System.out.println(el);
        }
        // System.out.println(Arrays.toString(b));
        System.out.println(countTime(b,ptr,n));
        
    }
}
