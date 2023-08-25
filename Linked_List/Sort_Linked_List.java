//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        ArrayList<Integer> a=new ArrayList<>();
        Node h=head;
        while(h!=null){
            a.add(h.data);
            h=h.next;
        }
        Collections.sort(a);
        Node e=head;
        int i=0;
        while(e!=null){
            e.data=a.get(i++);
            e=e.next;
        }
        return head;
    }
}


//gfg
//sort 0's 1's 2's Linked List
