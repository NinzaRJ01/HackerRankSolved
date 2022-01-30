public class UsingAnotherLinkedList {
    public ListNode insertionSortList(ListNode head){
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
        
        ListNode head2 = new ListNode();
        head2.next=null;

        ListNode ptr = head;
        ListNode ptr2 = head2;

        while(ptr!=null){
            ListNode ptrNext = ptr.next;
            ListNode p = null;
            while(ptr2.next!=null){
                if(ptr2.next.val>=ptr.val)break;
                p = ptr2;
                ptr2 =ptr2.next;    
            }
            ptr.next = ptr2.next;
            ptr2.next = ptr;

            ptr = ptrNext;
            ptr2=head2;
        }
        return head2.next;
    }

}
