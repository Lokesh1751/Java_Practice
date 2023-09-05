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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                a.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(a);
        System.out.print(a);
        ListNode head=null;
        ListNode tail=null;
        for(Integer k:a){
             ListNode newnode=new ListNode(k);
if(head==null){
     head=newnode;
     tail=newnode;
}
else{
    tail.next=newnode;
    tail=newnode;
}
        }
        return head;
    }
}
//LEETCODE
