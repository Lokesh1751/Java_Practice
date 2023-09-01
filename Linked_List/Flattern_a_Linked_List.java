/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	ArrayList<Integer> a=new ArrayList<Integer>();
	Node r=root;
	while(r!=null){
	    Node temp=r;
	    while(temp!=null){
	        a.add(temp.data);
	        temp=temp.bottom;
	    }
	    r=r.next;
	}
	Collections.sort(a);
	Node temp2 = root;
   for(Integer i : a){
       Node temp3 = new Node(i);
       temp2 . bottom = temp3;
       temp2 = temp2 .bottom;
   }
   return root.bottom;
    }
}
