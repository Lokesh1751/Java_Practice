/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
    Node curr=head;
    while(curr.next!=null){
        if(curr.data<curr.next.data){
            curr.data=curr.next.data;
            curr.next=curr.next.next;
            curr=head;
        }
        else{
            curr=curr.next;
        }
    }
    return head;
    }
}
  //GFG
