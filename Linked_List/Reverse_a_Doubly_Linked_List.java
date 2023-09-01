//APPROACH 1

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenfirst=even;
        while(true){
            if(odd==null || even==null || even.next==null){
                odd.next=evenfirst;
                break;
            }
            odd.next=even.next;
            odd=even.next;
            if(odd.next==null){
                even.next=null;
                odd.next=evenfirst;
                break;
            }
             even.next=odd.next;
            even=odd.next;
        }
        return head;
    }
}
