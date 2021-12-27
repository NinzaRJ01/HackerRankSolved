/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/  boolean isValid(Node root,long min,long max){
    if(root==null)return true;
    long val = root.data;
    
    if(val<=min)return false;
    if(val>=max)return false;
    
    return isValid(root.left,min,root.data) && isValid(root.right,root.data,max);
    }
    boolean checkBST(Node root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
