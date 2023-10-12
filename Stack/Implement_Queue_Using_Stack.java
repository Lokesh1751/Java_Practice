class MyQueue {
Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        this.st1=new Stack<>();
        this.st2=new Stack<>();
        
    }
    
    public void push(int x) {
        st1.add(x);
    }
    
    public int pop() {
        int ans=0;
        while(!st1.isEmpty()){
            st2.add(st1.pop());
        }
        ans=st2.pop();
        while(!st2.isEmpty()){
            st1.add(st2.pop());
        }
        return ans;

    }
    
    public int peek() {
         int ans=0;
        while(!st1.isEmpty()){
            st2.add(st1.pop());
        }
        ans=st2.peek();
        while(!st2.isEmpty()){
            st1.add(st2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//LEETCODE
