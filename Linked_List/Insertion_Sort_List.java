//APPROACH 1 USING ARRAYLIST
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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        ListNode head1=null;
        ListNode tail=null;
        for(Integer i:ans){
            ListNode nn=new ListNode(i);
            if(head1==null){
                head1=nn;
                tail=nn;
            }
            else{
                tail.next=nn;
                tail=nn;
            }
        }
        return head1;
    }
}
