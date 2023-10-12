//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int mid=s.size()/2;
        Stack<Integer> ans=new Stack<>();
        int i=0;
        while(i!=mid){
            i++;
            ans.add(s.pop());
        }
        s.pop();
        while(!ans.isEmpty()){
            s.add(ans.pop());
        }
    } 
}
//LEETCODE
