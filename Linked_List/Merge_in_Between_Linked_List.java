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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        int i=0;
        while(i!=a)
        {
            i++;
            temp=temp.next;
        }
        temp.val=temp.next.val;
        temp.next=temp.next.next;

          temp=list1;
          ListNode h=list1;
          int k=0;
        while(k!=b)
        {
            k++;
            temp=temp.next;
            h=h.next;
        }
        System.out.print(i);

        temp=list1;
        int j=0;
        while(j<i-1){
            j++;
            temp=temp.next;
        }
        
       temp.next=list2;
       temp=list1;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=h;
       return list1;
    }
}
//LEETCODE
