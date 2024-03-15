class Node {
    String str;
    Node next;
    Node prev;
    
    Node(String s) {
        this.str = s;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    String homepage;
    Node head;
    Node curr;
    Node tail;
    
    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        head = new Node(homepage);
        curr = head;
        tail = head;
    }
    
    public void visit(String url) {
        Node newnode = new Node(url);
        curr.next = newnode;
        newnode.prev = curr;
        curr = newnode;
        tail = newnode;
    }
    
    public String back(int steps) {
        int i = 0;
        while (i < steps && curr.prev != null) {
            curr = curr.prev;
            i++;
        }
        return curr.str;
    }
    
    public String forward(int steps) {
        int i = 0;
        while (i < steps && curr.next != null) {
            curr = curr.next;
            i++;
        }
        return curr.str;
    }
}

//LEETCODE
