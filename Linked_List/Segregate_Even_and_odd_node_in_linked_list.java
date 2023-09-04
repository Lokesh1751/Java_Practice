//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        ArrayList<Integer> od=new ArrayList<>();
         ArrayList<Integer> ev=new ArrayList<>();
         Node temp=head;
         while(temp!=null){
             int d=temp.data;
             if(d%2==0){
                 ev.add(d);
             }
             else{
                 od.add(d);
             }
             temp=temp.next;
         }
         Node h=null;
         Node t=null;
        for(Integer i:ev){
            Node newnode=new Node(i);
            if(h==null){
                h=newnode;
                t=newnode;
            }
            else{
                t.next=newnode;
                t=newnode;
            }
        }
         for(Integer i:od){
            Node newnode=new Node(i);
            if(h==null){
                h=newnode;
                t=newnode;
            }
            else{
                t.next=newnode;
                t=newnode;
            }
        }
        return h;
    }
}
//GFG
