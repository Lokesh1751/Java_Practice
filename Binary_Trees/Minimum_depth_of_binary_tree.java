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
    public int minDepth(TreeNode root) {
         return (root == null) ? 0 : (root.left == null || root.right == null) ? 1 + minDepth(root.left) + minDepth(root.right) : 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
//LEETCODE
