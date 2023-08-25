

/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if(head==null || head.next==null){
            return head;
        }
        HashSet<Integer> hm=new HashSet<>();
        Node c=head;
        Node prevnode=null;
        Node currnode=head;
        while(currnode!=null){
            if(hm.contains(currnode.data)){
                currnode=currnode.next;
                prevnode.next=currnode;
            }
            else{
                 hm.add(currnode.data);
                  prevnode=currnode;
                  currnode=currnode.next;
            }
        }
        return head;
    }
}
//LEETCODE
