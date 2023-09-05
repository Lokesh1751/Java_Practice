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
    public static ListNode findmid(ListNode head){
        ListNode hare=head.next;
        ListNode turtle=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head1=list1;
        ListNode head2=list2;
        ListNode finalans=null;
        ListNode anshead=null;
        while(head1!=null && head2!=null){
            if(head1.val>head2.val){
                if(finalans==null){
                    ListNode l=new ListNode(head2.val);
                    finalans=l;
                    anshead=l;
                }
                else{
                    ListNode l=new ListNode(head2.val);
                    finalans.next=l;
                    finalans=l;
                }
                head2=head2.next;
            }
            else{
                if(finalans==null){
                    ListNode l=new ListNode(head1.val);
                    finalans=l;
                     anshead=l;
                }
                else{
                    ListNode l=new ListNode(head1.val);
                    finalans.next=l;
                    finalans=l;
                }
                head1=head1.next;
            }
            
        }
        while(head1!=null){
            if(finalans==null){
                    ListNode l=new ListNode(head1.val);
                    finalans=l;
                     anshead=l;
                }
                else{
                    ListNode l=new ListNode(head1.val);
                    finalans.next=l;
                    finalans=l;
                }
                head1=head1.next;
        }
         while(head2!=null){
            if(finalans==null){
                    ListNode l=new ListNode(head2.val);
                    finalans=l;
                     anshead=l;
                }
                else{
                    ListNode l=new ListNode(head2.val);
                    finalans.next=l;
                    finalans=l;
                }
                head2=head2.next;
        }
        return anshead;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        //recursive call to sort
        left=sortList(left);
        right=sortList(right);

        ListNode result=mergeTwoLists(left,right);
        return result;
    }
}
//LEETCODE
//QUESTION NAME=> SORT LIST
