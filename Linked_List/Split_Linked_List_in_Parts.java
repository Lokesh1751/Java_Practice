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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int l=len/k;
        int distribute=len%k;
        ListNode node=head;
        ListNode prev=null;
        int i=0;
        while(node!=null && i<k){
            ans[i]=node;
            for(int j=0;j<l+(distribute>0?1:0);j++){
                prev=node;
                    node=node.next;
            }
            prev.next=null;
            i++;
            distribute--;
        }
        return ans;
    }
}
//LEETCODE
