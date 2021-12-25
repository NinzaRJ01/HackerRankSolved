import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

	public static void levelOrder(Node root) {
        Node curr = root;
        List<Node> queue= new ArrayList<>();//Using As Queue first come first server
        System.out.print(curr.data);
        queue.add(curr.left);
        queue.add(curr.right);
        while(!queue.isEmpty()){
            //pop operation
            curr = queue.remove(0);// works n times must use real queue
            if(curr==null)continue;
            System.out.print(" "+curr.data);
            if(curr.left!=null)queue.add(curr.left);
            if(curr.right!=null)queue.add(curr.right);
        }
      
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}
