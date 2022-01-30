/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)return head;
        Stack<ListNode> st = new Stack<>();
        Stack<ListNode> st2 = new Stack<>();
        ListNode ptr = head.next;
        st.push(head);
        //Using Stack
        while(ptr!=null){
            ListNode ptrNext = ptr.next;
            ListNode lastly = st.peek();
            while(!st.empty() && (st.peek()).val>ptr.val){
                st2.push(st.pop());
            }
            if(st.empty()){
                ListNode prevHead = head;
                lastly.next = ptr.next;
                head = ptr;
                ptr.next = prevHead;
            }else if(lastly!=st.peek()){ 
                ListNode nextCurrentPeek = (st.peek()).next;
                lastly.next= ptr.next;
                (st.peek()).next = ptr;
                ptr.next = nextCurrentPeek;
            }
            st.push(ptr);
            while(!st2.empty()){
                st.push(st2.pop());
            }
            ptr = ptrNext;
        }
        return head;
    }
}