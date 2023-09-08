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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode temp1=head;
        int i=1;
        int s=0;
        ListNode t=head;
        while(t!=null){
            t=t.next;
            s++;
        }
        while(i!=k){
            temp=temp.next;
            i++;
        }
        int l=s-k;
        int o=0;
        while(o!=l){
temp1=temp1.next;
o++;
        }
      int r=temp.val;
      temp.val=temp1.val;
      temp1.val=r;
      return head;
    }
}
//LEETCODE
