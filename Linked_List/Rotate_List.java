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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int s=0;
        ListNode t=head;
        while(t!=null){
            s++;
            t=t.next;
        }
        k=k%s;
       for(int i=0;i<k;i++){
            ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
       temp.next=head;
       prev.next=null;
       head=temp;
       }
              return head;
    }
}
//LEETCODE
