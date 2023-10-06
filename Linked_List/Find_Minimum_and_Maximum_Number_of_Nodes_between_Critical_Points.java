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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
         ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        for(int i=1;i<al.size()-1;i++){
            int curr=al.get(i);
            if(curr>al.get(i-1) && curr>al.get(i+1)){
                ans.add(i+1);
            }
           else  if(curr<al.get(i-1) && curr<al.get(i+1)){
                ans.add(i+1);
            }
        }
      if(ans.size()<2){
          return new int[]{-1,-1};
      }
      int mini=Integer.MAX_VALUE;
      for(int i=0;i<ans.size()-1;i++){
mini=Math.min(mini,ans.get(i+1)-ans.get(i));
      }
      int maxi=ans.get(ans.size()-1)-ans.get(0);
      return new int[] {mini,maxi};
    }
}
//LEETCODE
