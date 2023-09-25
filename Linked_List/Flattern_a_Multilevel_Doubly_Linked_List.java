/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        Node tail=head;
        Stack<Node> s=new Stack<>();
        while(curr!=null){
if(curr.child!=null){
    Node ch=curr.child;
    if(curr.next!=null){
        s.push(curr.next);
        curr.next.prev=null;

    }
    curr.next=ch;
    ch.prev=curr;
    curr.child=null;
    
}
tail=curr;
    curr=curr.next;
        }
        while(!s.isEmpty()){
            curr=s.pop();
            tail.next=curr;
            curr.prev=tail;
            while(curr!=null){
             tail=curr;
             curr=curr.next;
            }
        }
        return head;
    }
}
//LEETCODE
