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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode newnode=new ListNode(temp.val);
                if(head1==null && tail1==null){
                    head1=newnode;
                    tail1=newnode;
                }
                else{
tail1.next=newnode;
tail1=newnode;
                }
            }
            temp=temp.next;
        }
        temp=head;
         while(temp!=null){
            if(temp.val>=x){
                ListNode newnode=new ListNode(temp.val);
                if(head1==null && tail1==null){
                    head1=newnode;
                    tail1=newnode;
                }
                else{
tail1.next=newnode;
tail1=newnode;
                }
            }
            temp=temp.next;
        }
        return head1;
    }
}
//LEETCODE
