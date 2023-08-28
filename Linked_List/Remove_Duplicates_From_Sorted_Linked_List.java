/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
Node temp=head;
while(temp!=null){
    if(temp.next!=null && temp.data==temp.next.data){
        temp.next=temp.next.next;
    }
    else{
        temp=temp.next;
    }
}
return head;
    }
}
//LEETCODE
//GFG
