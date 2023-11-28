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

//BRUTE FORCE
class Solution {
        public   List<Integer> ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
       sol(root);
        return ans;
    }
     public  void sol(TreeNode root){
         if(root==null){
            return ;
        }
        sol(root.left);
        ans.add(root.val);
        sol(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        sol(root);
       int mini=Integer.MAX_VALUE;
       for(int i=0;i<ans.size();i++){
           for(int j=i+1;j<ans.size();j++){
               mini=Math.min(Math.abs(ans.get(i)-ans.get(j)),mini);
           }
       }
       return mini;
    }
}


//OPTIMIZE SOLUTION
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
   public int mindiff=Integer.MAX_VALUE;
   public int prev=-1;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return mindiff;
        }
        getMinimumDifference(root.left);
        if(prev!=-1){
            mindiff=Math.min(mindiff,root.val-prev);
        }
        if(root!=null){
            prev=root.val;
        }
        getMinimumDifference(root.right);
        return mindiff;
    }
}

//LEETCODE
