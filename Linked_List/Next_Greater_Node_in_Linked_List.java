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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        boolean ans=false;
        ListNode temp=head;
        while(temp!=null){
            ListNode currnode=temp.next;
            ans=false;
            while(currnode!=null){
                if(currnode.val>temp.val){
                    ans=true;
                    al.add(currnode.val);
                    break;
                }
                currnode=currnode.next;
            }
            if(ans==false){
                al.add(0);
            }
            temp=temp.next;
        }
        int arr[]=new int[al.size()];
       int j=0;
       for(Integer i:al){
           arr[j++]=i;
       }
        return arr;
    }
}
//LEETCODE
