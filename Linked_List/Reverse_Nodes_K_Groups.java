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
    public static int length(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public static ListNode reversekgroups(ListNode head,int k,int n){
        if(n<k){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode nex=null;
        int cnt=0;
        while(cnt<k && curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            cnt++;
        }
        if(nex!=null){
            head.next=reversekgroups(nex,k,n-k);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=length(head);
        return reversekgroups(head,k,len);
    }
}
//LEETCODE
