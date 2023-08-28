/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1=headA;
        ListNode h2=headB;
        int len1=0;
        int len2=0;
        while(h1!=null){
            len1++;
            h1=h1.next;
        }
        while(h2!=null){
            len2++;
            h2=h2.next;
        }
        int diff=Math.abs(len1-len2);
        h1=headA;
        h2=headB;
        if(len1>len2){
            while(diff-- >0){
h1=h1.next;
            }
        }
        else{
             while(diff-- >0){
h2=h2.next;
            }
        }
        while(h1!=h2){
            if(h1==null || h2==null){
                return null;
            }
            h1=h1.next;
            h2=h2.next;
        }
        return h1;
    }
}
//LEETCODE
