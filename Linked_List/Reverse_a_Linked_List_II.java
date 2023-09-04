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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int i=1;
        temp=head;
        ListNode temp2=head;
        while(i!=left){
           if(temp!=null && temp.next!=null){
                temp=temp.next;
                temp2=temp2.next;
           }
           i++;
        }
        while(i!=right){
            temp2=temp2.next;
            i++;
        }
        ArrayList<Integer> a=new ArrayList<>();
        ListNode t1=temp;
        ListNode t2=temp2;
        while(t1!=t2.next){
            a.add(t1.val);
            t1=t1.next;
        }
         i=0;
         Collections.reverse(a);
while(temp!=temp2.next){
    temp.val=a.get(i++);
    temp=temp.next;
}
return head;

    }
}
//leetcode
