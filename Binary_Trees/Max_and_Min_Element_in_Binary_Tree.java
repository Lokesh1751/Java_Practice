//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public static int findMax(Node root){
            if(root==null){
                return Integer.MIN_VALUE;
            }
            return Math.max(Math.max(findMax(root.left),findMax(root.right)),root.data);
    }
    public static int findMin(Node root){
         if(root==null){
                return Integer.MAX_VALUE;
            }
            return Math.min(Math.min(findMin(root.left),findMin(root.right)),root.data);
    }
}
//LEETCODE
