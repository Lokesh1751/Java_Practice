 public List<List<Integer>> ll=new ArrayList<>();
    public  int height(TreeNode root){
        if(root==null){
return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public void printlevel(TreeNode root,int l){
        if(root==null){
            return ;
        }
        if(l==1){
System.out.print(root.val+" ");
        }
        else if(l>1){
            printlevel(root.left,l-1);
            printlevel(root.right,l-1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        for(int i=1;i<=height(root);i++){
            printlevel(root,i);
        }
        return ll;
    }
//O(N2)


//O(N)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> sol=new ArrayList<>();
        if(root==null){
            return sol;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                if(!q.isEmpty()){
                    q.add(null);
                }
                 sol.add(ans);
                ans=new ArrayList<>();
            }
            else{
               ans.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                 if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sol;
    }
}
//LEETCODE

