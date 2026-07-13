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
    public ListNode reverseList(ListNode head) {
        ListNode c=head;
        ListNode pre=null;
        while(c!=null){
            ListNode nextnode=c.next;
            c.next=pre;
            pre=c;

            c=nextnode;
        }
        head=pre;
        return head;
    }
}