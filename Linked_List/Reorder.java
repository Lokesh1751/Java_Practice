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
    public static ListNode reverse(ListNode slow){
        ListNode prevnode=slow;
        ListNode currnode=slow.next;
        while(currnode!=null){
            ListNode nextnode=currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=nextnode;
            
        }
        slow.next=null;
        slow=prevnode;
        return slow;
}
    public static void merge(ListNode l1,ListNode l2){
        while(l2!=null){
            ListNode nx=l1.next;
            l1.next=l2;
            l1=l2;
            l2=nx;
        }
    }
    public void reorderList(ListNode head) {
       if(head==null || head.next==null){
           return;
       }
       ListNode slow=head;
       ListNode fast=head;
       ListNode prev=null;
       while(fast!=null && fast.next!=null){
prev=slow;
slow=slow.next;
fast=fast.next.next;
       }
       prev.next=null;
       ListNode l1=head;
       ListNode l2=reverse(slow);
       merge(l1,l2);
    }
}
//LEETCODE
