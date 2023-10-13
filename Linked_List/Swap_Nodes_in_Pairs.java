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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode next=head.next.next;
        head=curr;
        head.next=prev;
        head.next.next=swapPairs(next);
        return head;
}
}
//LEETCODE
