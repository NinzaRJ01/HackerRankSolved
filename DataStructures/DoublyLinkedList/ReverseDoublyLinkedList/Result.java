class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        
        Stack<DoublyLinkedListNode> st = new Stack<>();
        DoublyLinkedListNode ptr = llist;
        while(ptr!=null){
            st.add(ptr);
            ptr=ptr.next;
        }
        DoublyLinkedListNode start = st.pop();
        ptr = start;
        ptr.prev = null;
        while(!st.empty()){
            ptr.next = st.pop();
            ptr.next.prev = ptr;
            ptr = ptr.next;
        }
        ptr.next = null;
        return start;
    
    }

}
