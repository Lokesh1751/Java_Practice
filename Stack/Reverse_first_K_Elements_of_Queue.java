// User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i!=k){
            st.add(q.poll());
            i++;
        }
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
         while(!q.isEmpty()){
            ans.add(q.peek());
            q.poll();
        }
        return ans;
    }
}

//GFG
