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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f!=null) s=s.next;
        ListNode revhead=s,p=null;
        while(revhead!=null){
            ListNode newn=revhead.next;
            revhead.next=p;
            p=revhead;
            revhead=newn;
        }
        ListNode revhead1=p;
        ListNode curr=head;
        while(revhead1!=null){
            if(curr.val!=revhead1.val) return false;
            curr=curr.next;
            revhead1=revhead1.next;
        }
        return true;
    }
}