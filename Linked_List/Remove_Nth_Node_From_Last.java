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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null ){
            return null;
        }
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        if(n==s){
            return head.next;
        }
        int dest=s-n;
        System.out.print(dest);
        int i=1;
        ListNode temp1=head;
        while(i<dest){
            temp1=temp1.next;
            i++;
        }
        temp1.next=temp1.next.next;

return head;
    }
}
//LEETCODE MEDIUM
