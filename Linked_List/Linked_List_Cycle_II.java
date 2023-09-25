/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     ListNode temp=head;
     ListNode hare=head;
     ListNode turtle=head;
     while(hare!=null && hare.next!=null){
    hare=hare.next;
    hare=hare.next;
    turtle=turtle.next;
if(hare==turtle){
     turtle=head;
     while(turtle!=hare){
         turtle=turtle.next;
         hare=hare.next;
     }
     return turtle;
}
     }   
     return null;
    }
}
//LEETCODE
