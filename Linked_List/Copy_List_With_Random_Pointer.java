/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//Approach 1
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Map<Node,Node> map=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        for(Node key:map.keySet()){
            Node newnode=map.get(key);
            newnode.next=map.get(key.next);
            newnode.random=map.get(key.random);
        }
            return map.get(head);
    }
}

//APPROACH 2
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        if(head.random==null && head.next==null){
            Node newnode=head;
            newnode.next=null;
            newnode.random=null;
        }
         if(head.random!=null && head.next==null){
            Node newnode=head;
            newnode.next=null;
            newnode.random=head;
        }
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null){
            if(curr.next!=null){
                curr.next.random= (curr.random!=null)? curr.random.next:null;
            }
            curr=curr.next.next;
        }
        Node org=head,copy=head.next;
        Node temp=copy;
        while(org!=null){
            org.next=org.next.next;
            if(copy!=null && copy.next!=null){
                copy.next=copy.next.next;
            }
            org=org.next;
            copy=copy.next;
        }
        return temp;
    }
}
