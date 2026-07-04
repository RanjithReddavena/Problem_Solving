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
        ListNode p=null;
        while(c!=null){
            ListNode nn=c.next;
            c.next=p;
            p=c;
            c=nn;
        }
        head=p;
        return head;
    }
}