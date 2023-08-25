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
        if(head==null || head.next==null){
            return head;
        }
          ListNode prevnode=head;
        ListNode currnode=head.next;
        while(currnode!=null){
            ListNode nextnode=currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
        return head;
    }
}
//LEETCODE
