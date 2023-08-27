/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    public static Node detectloop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && slow!=null){
            slow=slow.next;
           fast=fast.next;
           if(fast!=null){
               fast=fast.next;
           }
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    public static Node firstnode(Node head){
if(head==null){
    return null;
}
        Node intersection=detectloop(head);
        if(intersection==null){
            return null;
        }
        Node slow=head;
        while(slow!=intersection){
            
            slow=slow.next;
            intersection=intersection.next;
        }
        return slow;
    }
    public static void removeLoop(Node head){
       if(head==null){
           return;
       }
       Node start=firstnode(head);
       if(start==null){
           return;
       }
       Node temp=start;
       while(temp.next!=start){
           temp=temp.next;
       }
       temp.next=null;
    }
}
//GFG
