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
    public int height(TreeNode root){
          if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
         int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int curr = leftHeight + rightHeight;
        int lf=diameterOfBinaryTree(root.left);
        int rh=diameterOfBinaryTree(root.right);
       
        return Math.max(curr,Math.max(lf,rh));

    }
}
//LEETCODE
